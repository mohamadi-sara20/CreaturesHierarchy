package Taxonomy;

public class Humans extends Mammals {

    private Gender gender;
    private Age age;

    public Humans(String species, Reproduction reproduction, Respiration respiration, Language language, Hair hair, Age age, Gender gender){
        super(species, reproduction, respiration, language, hair);
        this.gender = gender;
        this.age = age;
    }

    public Humans(Humans human){
        super(human);
        this.gender = human.getGender();
        this.age = human.getAge();


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
    public Humans clone(){
        return (Humans) super.clone();
    }


    public int compareTo(Humans human){
        int c = super.compareTo(human);
        if(c != 0)
            return c;
        else {                                                              //equal in superclass features
                                                                            //now look for inequality in Gender
            if(this.getGender().compareTo(human.getGender()) > 0)
                return 1;
            if(this.getGender().compareTo(human.getGender()) < 0)
                return -1;
                                                                            //If genders are equal, find inequality in Age.
            if(this.getAge().compareTo(human.getAge()) > 0)
                return 1;
            if(this.getAge().compareTo(human.getAge()) < 0)
                return -1;
                                                                            //Age also equal. So the two objects are equal.
            return 0;
        }
    }

}
