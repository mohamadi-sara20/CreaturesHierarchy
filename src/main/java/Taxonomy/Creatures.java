package Taxonomy;

public abstract class Creatures implements Cloneable{
    private Reproduction reproduction;
    private Respiration respiration;
    private Languge language;
    public Creatures(Reproduction reproduction, Respiration respiration, Languge language){
        this.respiration = respiration;
        this.reproduction = reproduction;
        this.language = language;
    }

    public void setReproduction(Reproduction reproduction){this.reproduction = reproduction;}
    public void setRespiration(Respiration respiration){this.respiration = respiration;}
    public void setLanguage(Languge language){this.language = language;}

    public Reproduction getReproduction(){return this.reproduction;}
    public Respiration getRespiration(){return  this.respiration;}
    public Languge getLanguage(){return this.language;}


    @Override
    public String toString(){
        final StringBuilder representation = new StringBuilder();
        return representation.append("Reproduction: " + getReproduction() + "    Respiration: " + getRespiration() + " Language:    " + getLanguage()).toString();
    }

   // @Override
    public boolean equals(Creatures creatures) {

        if (creatures == this)
            return true;
        if (creatures==null)
            return false;

        if (creatures == this && creatures instanceof Creatures) {
        //    Creatures creature = (Creatures) object;
            return (this.getRespiration() == creatures.getRespiration() && this.getReproduction() == creatures.getReproduction() && this.getLanguage() == creatures.getLanguage());
        }
        return false;
    }

    @Override
    public int hashCode(){
        int result = 17;
        result += 31 * result + (getReproduction() == null ? 0 : getReproduction().hashCode());
        result += 31 * result + (getRespiration() == null ? 0 : getRespiration().hashCode());
        result += 31 * result + (getLanguage() == null ? 0 : getLanguage().hashCode());
        return result;
    }



    @Override
    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException e){
            System.err.println("Cloning not supported!");
            return null;
        }
    }


}



