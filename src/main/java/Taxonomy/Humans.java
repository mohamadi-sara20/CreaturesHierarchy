package Taxonomy;

import java.util.HashMap;

public class Humans extends Mammals {

    private Gender gender;
    private Age age;

    public Humans(Reproduction reproduction, Respiration respiration, Language language, Hair hair, Age age, Gender gender){
        super(reproduction, respiration, language, hair);
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

    @Override
    public boolean equals(Object object) {
        if(object == this)
            return true;

        if(object instanceof Humans) {
            Humans human = (Humans) object;
            return (super.equals(object) && this.getAge() == human.getAge() && this.getGender() == (human.getGender()));
        }

        return false;
    }

    @Override
    public int hashCode(){
        int result = 17;
        result += 31 * result + (getAge() == null ? 0 : getAge().hashCode());
        result += 31 * result + (getGender() == null ? 0 : getGender().hashCode());
        result += super.hashCode();
        return result;
    }


}
