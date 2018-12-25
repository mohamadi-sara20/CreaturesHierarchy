package Taxonomy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class test {

    public static void main(String[] args){

        //base objects
        Animals yogi = new Animals("Bear", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.NA, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);
        Humans memol = new Humans("Homo Sapiens", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.UNLIMITED, Hair.HAIR, Age.YOUNG, Gender.FEMALE);
        Birds theUglyDuckling = new Birds("Duck", Reproduction.OVIOPAROUS, Respiration.LUNGS, Language.LIMITED, true, Diet.HERBIVOROUS, true);


        Animals a = new Animals(yogi);
        Humans h = new Humans(memol);
        Birds b = new Birds(theUglyDuckling);

        System.out.println(yogi.equals(a));
        a.setTameness(Tameness.DOMESTIC);
        System.out.println(yogi.equals(a));
        System.out.println(yogi.getTameness());
        System.out.println(memol.equals(h));
        System.out.println(theUglyDuckling.equals(b));
        System.out.printf("%s%n%s%n", yogi, a);
        System.out.printf("%s%n%s%n", memol, h);
        System.out.printf("%s%n%s", theUglyDuckling, b);
        //similar for symmetry test
        Animals bamse = new Animals("Bear", Reproduction.OVIOPAROUS, Respiration.LUNGS, Language.NA, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);
        Humans nell = new Humans("Homo Sapiens", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.UNLIMITED, Hair.HAIR, Age.YOUNG, Gender.FEMALE);
        Birds donaldDuck = new Birds("Duck", Reproduction.OVIOPAROUS, Respiration.LUNGS, Language.LIMITED, true, Diet.HERBIVOROUS, true);


        //similar for transitivity test
        Animals winnieThePooh = new Animals("Bear", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.NA, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);
        Humans anette = new Humans("Homo Sapiens", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.UNLIMITED, Hair.HAIR, Age.YOUNG, Gender.FEMALE);
        Birds countDokula = new Birds("Duck", Reproduction.OVIOPAROUS, Respiration.LUNGS, Language.LIMITED, true, Diet.HERBIVOROUS, true);


        //dissimilar
        Animals bear = new Animals("Bear", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.LIMITED, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);
        Humans human = new Humans("Homo Sapiens", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.UNLIMITED, Hair.HAIR, Age.ADOLESCENT, Gender.FEMALE);
        Birds bird = new Birds("Duck", Reproduction.OVIOPAROUS, Respiration.LUNGS, Language.LIMITED, true, Diet.CARNIVOROUS, true);

       ArrayList<Creatures> arrayList = new ArrayList<>();

        arrayList.add(yogi);
        arrayList.add(memol);
        arrayList.add(bamse);
        arrayList.add(nell);
        arrayList.add(theUglyDuckling);
        arrayList.add(donaldDuck);
        arrayList.add(anette);
        arrayList.add(countDokula);
        arrayList.add(bear);
        arrayList.add(human);
        arrayList.add(bird);
        arrayList.add(winnieThePooh);


        Collections.sort(arrayList);



    }

}

