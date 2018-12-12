package CreaturesHierarchy;

public class Test {

    public static void main(String[] args){

        Creatures[] creatures = new Creatures[5];

        Animals bear = new Animals(Creatures.Reproduction.VIVIPAROUS, Creatures.RESPIRATION.LUNGS, Creatures.LANGUAGE.NA, Mammals.Hair.HAIR, Animals.Diet.CARNIVOROUS, Animals.Tameness.WILD, false);
        Humans female = new Humans(Creatures.Reproduction.VIVIPAROUS, Creatures.RESPIRATION.LUNGS, Creatures.LANGUAGE.UNLIMITED, Mammals.Hair.HAIR, Humans.Age.YOUNG, Humans.Gender.FEMALE);
        Birds bird = new Birds(Creatures.Reproduction.OVIOPAROUS, Creatures.RESPIRATION.LUNGS, Creatures.LANGUAGE.LIMITED, true, Birds.Diet.HERBIVOROUS, true);
        Mammals dog = new Mammals(Creatures.Reproduction.VIVIPAROUS, Creatures.RESPIRATION.LUNGS, Creatures.LANGUAGE.LIMITED, Mammals.Hair.FUR);
        Creatures fish = new Creatures(Creatures.Reproduction.OVIOPAROUS, Creatures.RESPIRATION.GILLS, Creatures.LANGUAGE.NA);

        creatures[0] = bear;
        creatures[1] = female;
        creatures[2] = bird;
        creatures[3] = dog;
        creatures[4] = fish;

        for(Creatures creature: creatures){
            System.out.println(creature);
        }





    }
}


