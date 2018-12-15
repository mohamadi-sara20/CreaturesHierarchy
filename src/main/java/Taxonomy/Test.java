package Taxonomy;

public class Test {

    public static void main(String[] args) {

        Creatures[] creatures = new Creatures[3];
        Creatures[] compareList = new Creatures[6];

        Animals yogi = new Animals("Bear", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.NA, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);
        Humans memol = new Humans("Homo Sapiens", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.UNLIMITED, Hair.HAIR, Age.YOUNG, Gender.FEMALE);
        Birds theUglyDuckling = new Birds("Duck", Reproduction.OVIOPAROUS, Respiration.LUNGS, Language.LIMITED, true, Diet.HERBIVOROUS, true);

        creatures[0] = yogi;
        creatures[1] = memol;
        creatures[2] = theUglyDuckling;

        for (Creatures creature : creatures) {
            System.out.println(creature);

        }


        //Objects differing in only one characteristic
        try {

            Animals bamse = yogi.clone();
            Humans hana = memol.clone();
            Birds donaldDuck = theUglyDuckling.clone();

            Animals winnieThePooh = bamse.clone();
            winnieThePooh.setTameness(Tameness.DOMESTIC);
            winnieThePooh.setLanguage(Language.UNLIMITED);

            Humans lucien = hana.clone();
            lucien.setAge(Age.ADOLESCENT);
            lucien.setGender(Gender.MALE);

            Birds countDuckula = donaldDuck.clone();
            countDuckula.setLanguage(Language.NA);

            compareList[0] = bamse;
            compareList[1] = hana;
            compareList[2] = donaldDuck;
            compareList[3] = winnieThePooh;
            compareList[4] = lucien;
            compareList[5] = countDuckula;

        }
        catch (CloneNotSupportedException e){

            System.out.println(e.getMessage());
        }


        for (int i = 0; i < creatures.length; i++) {
            for (int j = 0; j < compareList.length; j++) {
                System.out.println(creatures[i].getSpecies() +  " equals " + compareList[j].getSpecies() + " : " + creatures[i].equals(compareList[j]));
            }
        }









    }
}


