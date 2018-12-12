package CreaturesHierarchy;

public class Test {

    public static void main(String[] args){

        Creatures[] creatures = new Creatures[3];
        Creatures[] compareList = new Creatures[6];

        Animals bear = new Animals(Reproduction.VIVIPAROUS, Respiration.LUNGS, Languge.NA, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);
        Humans female = new Humans(Reproduction.VIVIPAROUS, Respiration.LUNGS, Languge.UNLIMITED, Hair.HAIR, Age.YOUNG, Gender.FEMALE);
        Birds bird = new Birds(Reproduction.OVIOPAROUS, Respiration.LUNGS, Languge.LIMITED, true, Diet.HERBIVOROUS, true);

        creatures[0] = bear;
        creatures[1] = female;
        creatures[2] = bird;

        for(Creatures creature: creatures){
            System.out.println(creature);
        }

        //Objects differing in only one characteristic
        Animals compareBear1 = new Animals(Reproduction.OVIOPAROUS, Respiration.LUNGS, Languge.NA, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);
        Humans compareFemale1 = new Humans(Reproduction.OVIOPAROUS, Respiration.LUNGS, Languge.UNLIMITED, Hair.HAIR, Age.YOUNG, Gender.FEMALE);
        Birds compareBird1 = new Birds(Reproduction.VIVIPAROUS, Respiration.LUNGS, Languge.LIMITED, true, Diet.HERBIVOROUS, true);

        Animals compareBear = (Animals) bear.clone();
        Humans compareFemale = (Humans) female.clone();
        Birds compareBird = (Birds) bird.clone();

        compareList[0] = compareBear;
        compareList[1] = compareFemale;
        compareList[2] = compareBird;
        compareList[3] = compareBear1;
        compareList[4] = compareFemale1;
        compareList[5] = compareBird1;


        for(int i = 0; i < creatures.length; i++){
            for(int j = 0; j < compareList.length; j++){
                System.out.println("Creature " + (i + 1) + " equals creature " + (j + 1) + " : " + creatures[i].equals(compareList[j]));
            }

        }

    }
}


