package CreaturesHierarchy;

public class Test {

    public static void main(String[] args){

        Creatures[] creatures = new Creatures[3];

        Animals bear = new Animals(Reproduction.VIVIPAROUS, Respiration.LUNGS, Languge.NA, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);
        Humans female = new Humans(Reproduction.VIVIPAROUS, Respiration.LUNGS, Languge.UNLIMITED, Hair.HAIR, Age.YOUNG, Gender.FEMALE);
        Birds bird = new Birds(Reproduction.OVIOPAROUS, Respiration.LUNGS, Languge.LIMITED, true, Diet.HERBIVOROUS, true);

        creatures[0] = bear;
        creatures[1] = female;
        creatures[2] = bird;
        for(Creatures creature: creatures){
            System.out.println(creature);
        }


    }
}


