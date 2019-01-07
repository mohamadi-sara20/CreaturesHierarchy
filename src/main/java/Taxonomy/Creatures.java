package Taxonomy;

import java.io.Serializable;

public abstract class Creatures implements Cloneable, Comparable<Creatures>, ShallowCopy<Creatures>, DeepCopy<Creatures>, Serializable {

    private Reproduction reproduction;
    private Respiration respiration;
    private Language language;
    private String species;

    public Creatures(){}
    public Creatures(String species, Reproduction reproduction, Respiration respiration, Language language){

        this.species = species;
        this.respiration = respiration;
        this.reproduction = reproduction;
        this.language = language;
    }

    //Copy constructor
    public Creatures(Creatures creature){
        this.species = creature.getSpecies();
        this.reproduction = creature.getReproduction();
        this.respiration = creature.getRespiration();
        this.language = creature.getLanguage();


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


    public int compareTo(Creatures creature){

        if(this == creature)
            return 0;

        if((this.getSpecies().compareTo(creature.getSpecies())) > 0)
            return 1;
        if((this.getSpecies().compareTo(creature.getSpecies())) < 0)
            return -1;

        if((this.getReproduction().compareTo(creature.getReproduction())) > 0)
            return 1;
        if((this.getReproduction().compareTo(creature.getReproduction())) < 0)
            return -1;

        if((this.getRespiration().compareTo(creature.getRespiration())) > 0)
            return 1;
        if((this.getRespiration().compareTo(creature.getRespiration())) < 0)
            return -1;

        if((this.getLanguage().compareTo(creature.getLanguage())) > 0)
            return 1;
        if((this.getLanguage().compareTo(creature.getLanguage())) < 0)
            return -1;

        return 0;

    }


    @Override
    public Creatures shallowCopy(){
        return this;
    }


    @Override
    public void shallowCopyFrom(Creatures creature){
        this.species = creature.getSpecies();
        this.reproduction = creature.getReproduction();
        this.respiration = creature.getRespiration();
        this.language = creature.getLanguage();

    }


    @Override
    public Creatures deepCopy(){
        this.species = new String(this.getSpecies());
        //try {
        //   this.reproduction = this.reproduction.getClass().newInstance();
        //}
        //catch (Exception ex) {
        //}
        //this.respiration = this.getRespiration();
        //this.language = this.getLanguage();
        return this;
    }


    @Override
    public void deepCopyFrom(Creatures creature){
        this.species = new String(creature.getSpecies());
        this.reproduction = creature.getReproduction();
        this.respiration = creature.getRespiration();
        this.language = creature.getLanguage();
    }


}



