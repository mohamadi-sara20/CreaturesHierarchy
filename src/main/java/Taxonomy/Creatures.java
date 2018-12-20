package Taxonomy;

public abstract class Creatures implements Cloneable{
    private Reproduction reproduction;
    private Respiration respiration;
    private Language language;
    private String species;


    public Creatures(String species, Reproduction reproduction, Respiration respiration, Language language){

        this.species = species;
        this.respiration = respiration;
        this.reproduction = reproduction;
        this.language = language;
    }

    //public void setReproduction(Reproduction reproduction){this.reproduction = reproduction;}
    //public void setRespiration(Respiration respiration){this.respiration = respiration;}
    public void setLanguage(Language language){this.language = language;}
    public void setSpecies(String species){this.species = species;}


    public Reproduction getReproduction(){return this.reproduction;}
    public Respiration getRespiration(){return  this.respiration;}
    public Language getLanguage(){return this.language;}
    public String getSpecies(){return this.species;}


    @Override
    public String toString(){
        final StringBuilder representation = new StringBuilder();
        return representation.append("Species: ").append(getSpecies()).append("    Reproduction: ").append(getReproduction()).append( "    Respiration: ").append(getRespiration()).append( " Language:    ").append(getLanguage()).toString();
    }


    public boolean equals(Creatures creature) {

        if (creature == null)
            return false;

        if(creature == this)
            return true;

        return (this.getSpecies().equals(creature.getSpecies()) && this.getRespiration() == creature.getRespiration() && this.getReproduction() == creature.getReproduction() && this.getLanguage() == creature.getLanguage());

    }


    @Override
    public int hashCode(){

        int result = 17;
        result += 31 * result + (getReproduction() == null ? 0 : getReproduction().hashCode());
        result += 31 * result + (getRespiration() == null ? 0 : getRespiration().hashCode());
        result += 31 * result + (getLanguage() == null ? 0 : getLanguage().hashCode());
        result += 31 * result + (getSpecies() == null ? 0 : getSpecies().hashCode());
        return result;
    }


    @Override
    public Creatures clone(){
        try {

            return (Creatures) super.clone();
        }

        catch (CloneNotSupportedException e) {
            System.err.println("Clone failed! Please implement Cloneable! ");
            return null;
        }
    }


}



