package Taxonomy;

public class Humans extends Mammals {

    private Gender gender;
    private Age age;

    public Humans(String species, Reproduction reproduction, Respiration respiration, Language language, Hair hair, Age age, Gender gender){
        super(species, reproduction, respiration, language, hair);
        this.gender = gender;
        this.age = age;
    }

    public void setGender(Gender gender){this.gender = gender;}
    public void setAge(Age age){this.age = age;}

    public Age getAge(){return this.age;}
    public Gender getGender(){return this.gender;}

    @Override
    public String toString(){
        final StringBuilder representation = new StringBuilder();
        return representation.append(super.toString()).append("    Gender: ").append(this.getGender()).append(  "    Age: ").append(this.getAge()).toString();
    }


    public boolean equals(Creatures creature) {

        if(!(creature instanceof  Humans))
            return false;

        if(creature == this)
            return true;

        Humans human = (Humans) creature;
        return (super.equals(human) && this.getAge() == human.getAge() && this.getGender() == (human.getGender()));
    }

    @Override
    public int hashCode(){
        int result = super.hashCode();
        result += 31 * result + (getAge() == null ? 0 : getAge().hashCode());
        result += 31 * result + (getGender() == null ? 0 : getGender().hashCode());

        return result;
    }

    @Override
    public Humans clone() throws CloneNotSupportedException{
        return (Humans) super.clone();
    }


}
