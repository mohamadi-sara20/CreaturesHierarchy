package CreaturesHierarchy;

public class Animals extends Mammals{

    public enum Diet{CARNIVOROUS, HERBIVOROUS}
    public enum Tameness{WILD, DOMESTIC}
    private boolean quadrupedal;

    private Diet diet;
    private Tameness tameness;


    public Animals(Reproduction reproduction, RESPIRATION respiration, LANGUAGE language, Hair hair, Diet diet, Tameness tameness, boolean quadrupedal){
        super(reproduction, respiration, language, hair);
        this.diet = diet;
        this.tameness = tameness;
        this.quadrupedal = quadrupedal;
    }

    @Override
    public String toString(){
        return super.toString() + String.format("%s: %s    %s: %s    %s: %b    ", "Diet", this.diet, "Tameness", this.tameness, "Is Quadrupedal:" , this.quadrupedal);
    }


}
