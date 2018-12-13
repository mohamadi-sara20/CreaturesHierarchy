package Taxonomy;


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
        final StringBuilder representation = new StringBuilder();
        return super.toString() + representation.append("    Diet: " + getDiet() + "    Has feathers: " + getFeathers() + "    Flies: "+ getFly()).toString();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Birds) {
            Birds birds = new Birds(Reproduction.OVIOPAROUS, Respiration.GILLS, Languge.NA, true, Diet.CARNIVOROUS, true);
            return (super.equals(object) && this.getFly() == ((Birds) object).getFly() && this.getFeathers() == ((Birds) object).getFeathers() && this.getDiet() == ((Birds) object).getDiet());
        }
        return false;
    }

}


