package CreaturesHierarchy;

public class Humans extends Mammals {
    public enum Gender{MALE, FEMALE}
    public enum Age{INFANT, CHILD, ADOLESCENT, YOUNG, ADULT, MIDDLEAGED, SENIOR}

    private Gender gender;
    private Age age;

    public Humans(Reproduction reproduction, RESPIRATION respiration, LANGUAGE language, Hair hair, Age age, Gender gender){
        super(reproduction, respiration, language, hair);
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString(){
        return super.toString() + String.format("%s: %s    %s: %s    ", "Gender", this.gender, "Age", this.age);
    }
}
