package Taxonomy;


public class Birds extends Creatures{

    private boolean fly;
    private boolean feathers;
    private Diet diet;

    public Birds(String species, Reproduction reproduction, Respiration respiration, Language language, boolean feathers, Diet diet, boolean fly){
        super(species, reproduction, respiration, language);
        this.feathers = feathers;
        this.diet = diet;
        this.fly = fly;
    }

    //public void setFly(boolean fly){this.fly = fly;}
    //public void setFeathers(boolean feathers){this.feathers = feathers;}
    //public void setDiet(Diet diet){this.diet = diet;}

    public Diet getDiet(){return this.diet;}
    public boolean getFeathers(){return this.feathers;}
    public boolean getFly(){return this.fly;}


    @Override
    public String toString(){
        final StringBuilder representation = new StringBuilder();
        return representation.append(super.toString()).append("    Diet: ").append(getDiet()).append("    Has feathers: ").append(getFeathers()).append("    Flies: ").append(getFly()).toString();
    }


    public boolean equals(Creatures creature) {

        if(!(creature instanceof Birds))
            return false;

        if(creature == this)
            return true;

        Birds bird = (Birds) creature;
        return (super.equals(bird) && this.getFly() == bird.getFly() && this.getFeathers() == bird.getFeathers() && this.getDiet() == bird.getDiet());

    }


    @Override
    public int hashCode(){
        int result = super.hashCode();
        result += 31 * result + (getDiet() == null ? 0 : getDiet().hashCode());
        result += 31 * result + (getFeathers() ? 1 : 0);
        result += 31 * result + (getFly() ? 1 : 0);
        return result;
    }


    @Override
    public Birds clone() {
        return (Birds) super.clone();
    }

}

