package CreaturesHierarchy;

enum Diet{CARNIVOROUS, HERBIVOROUS}
enum Tameness{WILD, DOMESTIC}

public class Animals extends Mammals{

    private boolean quadrupedal;
    private Diet diet;
    private Tameness tameness;


    public Animals(Reproduction reproduction, Respiration respiration, Languge language, Hair hair, Diet diet, Tameness tameness, boolean quadrupedal){
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
        StringBuilder representation = new StringBuilder();

        return super.toString() + representation.append("Diet: " +  this.getDiet() + "Tameness: " +  this.getTameness() +
                "Is Quadrupedal: "  +  this.getQuadrupedal()).toString();
    }


}
