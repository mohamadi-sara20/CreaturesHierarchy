package Taxonomy;

enum Reproduction {OVIOPAROUS, VIVIPAROUS}
enum Languge{NA, LIMITED, UNLIMITED}
enum Respiration {LUNGS, INTEGUMENTARY, GILLS}


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

    @Override
    public boolean equals(Object object) {
        if (object instanceof Creatures) {
            //Downcast object to allow comparing
            Creatures creature = (Creatures) object;
            return (this.getRespiration() == creature.getRespiration() && this.getReproduction() == creature.getReproduction() && this.getLanguage() == creature.getLanguage());
        }
        return false;
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



