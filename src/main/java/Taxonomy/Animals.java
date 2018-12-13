package Taxonomy;

public class Animals extends Mammals{

    private boolean quadrupedal;
    private Diet diet;
    private Tameness tameness;


    public Animals(Reproduction reproduction, Respiration respiration, Language language, Hair hair, Diet diet, Tameness tameness, boolean quadrupedal){
        super(reproduction, respiration, language, hair);
        this.diet = diet;
        this.tameness = tameness;
        this.quadrupedal = quadrupedal;
    }

    public void setQuadrupedal(boolean quadrupedal){this.quadrupedal = quadrupedal;}
    public void setDiet(Diet diet){this.diet = diet;}
    public void setTameness(Tameness tameness){this.tameness = tameness;}

    public Diet getDiet(){return this.diet;}
    public Tameness getTameness(){return this.tameness;}
    public boolean getQuadrupedal(){return  this.quadrupedal;}

    @Override
    public String toString(){
        final StringBuilder representation = new StringBuilder();
        return super.toString() + representation.append("Diet: " +  this.getDiet() + "Tameness: " +  this.getTameness() +
                "Is Quadrupedal: "  +  this.getQuadrupedal()).toString();
    }


    @Override
    public boolean equals(Object object) {
        if (object == this && object instanceof Animals) {
            Animals animal = (Animals) object;
            return (super.equals(object) && this.getQuadrupedal() == animal.getQuadrupedal() && this.getDiet() == animal.getDiet() && this.getTameness() == animal.getTameness());
        }
        return false;

    }

    @Override
    public int hashCode(){
        int result = 17;
        result += 31 * result + (getQuadrupedal() ? 1 : 0);
        result += 31 * result + (getDiet() == null ? 0 : getDiet().hashCode());
        result += 31 * result + (getTameness() == null ? 0 : getTameness().hashCode());
        return result;
    }


}
