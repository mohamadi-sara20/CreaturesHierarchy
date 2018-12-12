package CreaturesHierarchy;

public class Test {

    public static void main(String[] args){

        Creatures[] creatures = new Creatures[3];
        Creatures[] compareList = new Creatures[9];

        Animals bear = new Animals(Reproduction.VIVIPAROUS, Respiration.LUNGS, Languge.NA, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);
        Humans female = new Humans(Reproduction.VIVIPAROUS, Respiration.LUNGS, Languge.UNLIMITED, Hair.HAIR, Age.YOUNG, Gender.FEMALE);
        Birds bird = new Birds(Reproduction.OVIOPAROUS, Respiration.LUNGS, Languge.LIMITED, true, Diet.HERBIVOROUS, true);

        creatures[0] = bear;
        creatures[1] = female;
        creatures[2] = bird;

        for(Creatures creature: creatures){
            System.out.println(creature);
        }


        //Objects with the same characteristics.
        Animals compareBear = new Animals(Reproduction.VIVIPAROUS, Respiration.LUNGS, Languge.NA, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);
        Humans compareFemale = new Humans(Reproduction.VIVIPAROUS, Respiration.LUNGS, Languge.UNLIMITED, Hair.HAIR, Age.YOUNG, Gender.FEMALE);
        Birds compareBird = new Birds(Reproduction.OVIOPAROUS, Respiration.LUNGS, Languge.LIMITED, true, Diet.HERBIVOROUS, true);

        //Objects differing in only one characteristic
        Animals compareBear1 = new Animals(Reproduction.OVIOPAROUS, Respiration.LUNGS, Languge.NA, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);
        Humans compareFemale1 = new Humans(Reproduction.OVIOPAROUS, Respiration.LUNGS, Languge.UNLIMITED, Hair.HAIR, Age.YOUNG, Gender.FEMALE);
        Birds compareBird1 = new Birds(Reproduction.VIVIPAROUS, Respiration.LUNGS, Languge.LIMITED, true, Diet.HERBIVOROUS, true);

        //Objects differing in more than one characteristic
        Animals compareBear2 = new Animals(Reproduction.VIVIPAROUS, Respiration.GILLS, Languge.UNLIMITED, Hair.FUR, Diet.CARNIVOROUS, Tameness.DOMESTIC, true);
        Humans compareFemale2 = new Humans(Reproduction.VIVIPAROUS, Respiration.INTEGUMENTARY, Languge.LIMITED, Hair.FUR, Age.INFANT, Gender.MALE);
        Birds compareBird2 = new Birds(Reproduction.OVIOPAROUS, Respiration.GILLS, Languge.NA, false, Diet.CARNIVOROUS, false);


        compareList[0] = compareBear;
        compareList[1] = compareFemale;
        compareList[2] = compareBird;
        compareList[3] = compareBear1;
        compareList[4] = compareFemale1;
        compareList[5] = compareBird1;
        compareList[6] = compareBear2;
        compareList[7] = compareFemale2;
        compareList[8] = compareBird2;






    }
}


