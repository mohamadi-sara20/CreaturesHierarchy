package CreaturesHierarchy;

public class Birds extends Creatures{

    public enum Diet{CARNIVOROUS, HERBIVOROUS}
    public boolean fly;
    public boolean feathers;
    private Diet diet;

    public Birds(Reproduction reproduction, RESPIRATION respiration, LANGUAGE language, boolean feathers, Diet diet, boolean fly){
        super(reproduction, RESPIRATION.LUNGS, language);
        this.feathers = feathers;
        this.diet = diet;
        this.fly = fly;
    }

    @Override
    public String toString(){
        return String.format("%s: %b    %s: %s    %s: %b    ", "Has feathers:", this.feathers, "Diet", this.diet, "Files", this.fly);
    }


}


