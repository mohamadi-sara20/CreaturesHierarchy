package Taxonomy;

enum Gender{MALE, FEMALE}
enum Age{INFANT, CHILD, ADOLESCENT, YOUNG, ADULT, MIDDLEAGED, SENIOR}

public class Humans extends Mammals {

    private Gender gender;
    private Age age;

    public Humans(Reproduction reproduction, Respiration respiration, Languge language, Hair hair, Age age, Gender gender){
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
        return super.toString() + representation.append("    Gender: " + this.getGender() +  "    Age: " +this.getAge()).toString();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Humans)
            //Downcast object to allow comparing
            return (super.equals(object) && this.getAge() == ((Humans) object).getAge() && this.getGender() == ((Humans) object).getGender());
        return false;
    }


}
