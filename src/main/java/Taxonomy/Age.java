package Taxonomy;

public enum Age implements DeepCopy<Enum>{
    INFANT, CHILD, ADOLESCENT, YOUNG, ADULT, MIDDLEAGED, SENIOR;

    public Enum deepCopy(){
        //System.arraycopy(Age.INFANT,0, Age.SENIOR, 0, 6);


        }

    public Enum deepCopyFrom(Enum e){}


}
