package Taxonomy;

public abstract class Creatures implements Cloneable{
    private Reproduction reproduction;
    private Respiration respiration;
    private Language language;
    public Creatures(Reproduction reproduction, Respiration respiration, Language language){
        this.respiration = respiration;
        this.reproduction = reproduction;
        this.language = language;
    }

    public void setReproduction(Reproduction reproduction){this.reproduction = reproduction;}
    public void setRespiration(Respiration respiration){this.respiration = respiration;}
    public void setLanguage(Language language){this.language = language;}

    public Reproduction getReproduction(){return this.reproduction;}
    public Respiration getRespiration(){return  this.respiration;}
    public Language getLanguage(){return this.language;}


    @Override
    public String toString(){
        final StringBuilder representation = new StringBuilder();
        return representation.append("Reproduction: ").append(getReproduction()).append( "    Respiration: ").append(getRespiration()).append( " Language:    ").append(getLanguage()).toString();
    }

    @Override
    public boolean equals(Object object) {

        if (object instanceof Creatures) {
            Creatures creature = (Creatures) object;
            return (this.getRespiration() == creature.getRespiration() && this.getReproduction() == creature.getReproduction() && this.getLanguage() == creature.getLanguage());
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




}



