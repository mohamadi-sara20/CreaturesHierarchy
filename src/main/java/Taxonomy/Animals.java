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

    public Animals(Animals animal){
        super(animal);
        this.diet = animal.getDiet();
        this.tameness = animal.getTameness();
        this.quadrupedal = animal.getQuadrupedal();
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
        return representation.append(super.toString()).append("    Diet: ").append(this.getDiet()).append("    Tameness: ").append(this.getTameness()).append("    Is Quadrupedal: ").append(this.getQuadrupedal()).toString();
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
    public Animals clone(){
        return (Animals) super.clone();
    }


    public int compareTo(Animals animal){

        int c = super.compareTo(animal);

        if(c != 0)                                                          //if super features are not equal, return.
            return c;

        else {                                                              //if super features are equal:

            if (this.getTameness().compareTo(animal.getTameness()) > 0)     //Find inequality in Tameness
                return 1;
            if (this.getTameness().compareTo(animal.getTameness()) < 0)
                return -1;
                                                                            //Tameness the same. Find inequality in diet.
            if(this.getDiet().compareTo(animal.getDiet()) > 0)
                return 1;
            if(this.getDiet().compareTo(animal.getDiet()) < 0)
                return -1;

            if(this.getQuadrupedal() && !animal.getQuadrupedal())           //Diet the same. Find inequality in quadrupedality.
                return 1;
            if(!this.getQuadrupedal() && animal.getQuadrupedal())
                return -1;

            return 0;                                                       //No inequalities found. Return 0.
        }

    }

}
