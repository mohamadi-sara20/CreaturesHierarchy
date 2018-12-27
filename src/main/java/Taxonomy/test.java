package Taxonomy;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class test {

    @SuppressWarnings("UnnecessaryLocalVariable")
    public static void main(String[] args){




        //base objects
        Animals yogi = new Animals("Bear", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.NA, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);
        Humans memol = new Humans("Homo Sapiens", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.UNLIMITED, Hair.HAIR, Age.YOUNG, Gender.FEMALE);
        Birds theUglyDuckling = new Birds("Duck", Reproduction.OVIOPAROUS, Respiration.LUNGS, Language.LIMITED, true, Diet.HERBIVOROUS, true);


        Animals a = yogi.deepCopy();

        Animals bamse = new Animals("Bear", Reproduction.OVIOPAROUS, Respiration.LUNGS, Language.NA, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);
        Humans nell = new Humans("Homo Sapiens", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.UNLIMITED, Hair.HAIR, Age.YOUNG, Gender.FEMALE);
        Birds donaldDuck = new Birds("Duck", Reproduction.OVIOPAROUS, Respiration.LUNGS, Language.LIMITED, true, Diet.HERBIVOROUS, true);

        String[] arrayOfStrings = new String[10];
        Object[] arrayOfObjects = arrayOfStrings;
        List<Integer> l;

        Animals winnieThePooh = new Animals("Bear", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.NA, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);
        Humans anette = new Humans("Homo Sapiens", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.UNLIMITED, Hair.HAIR, Age.YOUNG, Gender.FEMALE);
        Birds countDokula = new Birds("Duck", Reproduction.OVIOPAROUS, Respiration.LUNGS, Language.LIMITED, true, Diet.HERBIVOROUS, true);


        //dissimilar
        Animals bear = new Animals("Bear", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.LIMITED, Hair.FUR, Diet.CARNIVOROUS, Tameness.DOMESTIC, false);
        Humans human = new Humans("Homo Sapiens", Reproduction.OVIOPAROUS, Respiration.LUNGS, Language.UNLIMITED, Hair.FUR, Age.ADOLESCENT, Gender.FEMALE);
        Birds bird = new Birds("Duck", Reproduction.OVIOPAROUS, Respiration.GILLS, Language.LIMITED, false, Diet.CARNIVOROUS, false);
                yogi.shallowCopyFrom(bear);

    }


}


