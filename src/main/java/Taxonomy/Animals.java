package Taxonomy;

public class Animals extends Mammals{

    private boolean quadrupedal;
    private Diet diet;
    private Tameness tameness;


    public Animals(String species, Reproduction reproduction, Respiration respiration, Language language, Hair hair, Diet diet, Tameness tameness, boolean quadrupedal){
        super(species, reproduction, respiration, language, hair);
        this.diet = diet;
        this.tameness = tameness;
        this.quadrupedal = quadrupedal;
    }

    //public void setQuadrupedal(boolean quadrupedal){this.quadrupedal = quadrupedal;}
    //public void setDiet(Diet diet){this.diet = diet;}
    public void setTameness(Tameness tameness){this.tameness = tameness;}

    public Diet getDiet(){return this.diet;}
    public Tameness getTameness(){return this.tameness;}
    public boolean getQuadrupedal(){return  this.quadrupedal;}

    @Override
    public String toString(){
        final StringBuilder representation = new StringBuilder();
        return representation.append(super.toString()).append("Diet: ").append(this.getDiet()).append("Tameness: ").append(this.getTameness()).append("Is Quadrupedal: ").append(this.getQuadrupedal()).toString();
    }


    public boolean equals(Creatures creature) {

        if(!(creature instanceof  Animals))
            return false;

        if(creature == this)
            return true;

        Animals animal = (Animals) creature;
        return (super.equals(animal) && this.getQuadrupedal() == animal.getQuadrupedal() && this.getDiet() == animal.getDiet() && this.getTameness() == animal.getTameness());

    }

    @Override
    public int hashCode(){
        int result = super.hashCode();
        result += 31 * result + (getQuadrupedal() ? 1 : 0);
        result += 31 * result + (getDiet() == null ? 0 : getDiet().hashCode());
        result += 31 * result + (getTameness() == null ? 0 : getTameness().hashCode());
        return result;
    }


    @Override
    public Animals clone() throws CloneNotSupportedException{
        return (Animals) super.clone();
    }


}
