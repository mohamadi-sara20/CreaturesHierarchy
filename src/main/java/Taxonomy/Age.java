package Taxonomy;

public enum Age  {
    INFANT("INFANT"),
    CHILD("CHILD"),
    ADOLESCENT("ADOLESCENT"),
    YOUNG("YOUNG"),
    ADULT("ADULT"),
    MIDDLEAGED("MIDDLEAGED"),
    SENIOR("SENIOR");



    Age(String age){
        this.age = age;
    }

    private String age;

    }