package CreaturesHierarchy;

public class Birds extends Creatures{

    public boolean fly;
    public boolean feathers;
    private Diet diet;

    public Birds(Reproduction reproduction, Respiration respiration, Languge language, boolean feathers, Diet diet, boolean fly){
        super(reproduction, respiration, language);
        this.feathers = feathers;
        this.diet = diet;
        this.fly = fly;
    }

    public void setFly(boolean fly){this.fly = fly;}
    public void setFeathers(boolean feathers){this.feathers = feathers;}
    public void setDiet(Diet diet){this.diet = diet;}

    public Diet getDiet(){return this.diet;}
    public boolean getFeathers(){return this.feathers;}
    public boolean getFly(){return this.fly;}


    @Override
    public String toString(){
        return super.toString() + String.format("%10s: %10b    %10s: %10s    %10s: %10b    ", "Has feathers:", this.getFeathers(), "Diet", this.getDiet(), "Flies", this.getFly());
    }


}


