package Taxonomy.unitTest;


import Taxonomy.*;
import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class TestHash {

    private boolean expected;
    private Creatures creature1;
    private Creatures creature2;


    @Parameterized.Parameters
    public static List<Object[]> getParameters(){

        Animals yogi = new Animals("Bear", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.NA, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);
        Humans memol = new Humans("Homo Sapiens", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.UNLIMITED, Hair.HAIR, Age.YOUNG, Gender.FEMALE);
        Birds theUglyDuckling = new Birds("Duck", Reproduction.OVIOPAROUS, Respiration.LUNGS, Language.LIMITED, true, Diet.HERBIVOROUS, true);

        Animals bamse = new Animals("Bear", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.NA, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);
        Humans nell = new Humans("Homo Sapiens", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.UNLIMITED, Hair.HAIR, Age.YOUNG, Gender.FEMALE);
        Birds donaldDuck = new Birds("Duck", Reproduction.OVIOPAROUS, Respiration.LUNGS, Language.LIMITED, true, Diet.HERBIVOROUS, true);

        Animals bear = new Animals("Bear", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.LIMITED, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);
        Humans human = new Humans("Homo Sapiens", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.UNLIMITED, Hair.HAIR, Age.ADOLESCENT, Gender.FEMALE);
        Birds bird = new Birds("Duck", Reproduction.OVIOPAROUS, Respiration.LUNGS, Language.LIMITED, true, Diet.CARNIVOROUS, true);

        return Arrays.asList(new Object[][]{
                //equal
                {true, yogi, bamse},
                {true, memol, nell},
                {true, theUglyDuckling, donaldDuck},
                //not equal
                {false, yogi, bear},
                {false, memol, human},
                {false, theUglyDuckling, bird},

        });

    }

    public TestHash(boolean expected, Creatures creature1, Creatures creature2){
        this.creature1 = creature1;
        this.creature2 = creature2;
        this.expected = expected;
    }


    @Test
    public void testHashEquality(){
        Assert.assertEquals(expected,creature1.hashCode() == creature2.hashCode());
    }


    @Test
    public void testConsistency(){

        Animals yogi = new Animals("Bear", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.NA, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);
        Humans memol = new Humans("Homo Sapiens", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.UNLIMITED, Hair.HAIR, Age.YOUNG, Gender.FEMALE);
        Birds theUglyDuckling = new Birds("Duck", Reproduction.OVIOPAROUS, Respiration.LUNGS, Language.LIMITED, true, Diet.HERBIVOROUS, true);

        int hashCode = yogi.hashCode();
        Assert.assertTrue(yogi.hashCode() == hashCode);
        hashCode = memol.hashCode();
        Assert.assertTrue(hashCode == memol.hashCode());
        hashCode = theUglyDuckling.hashCode();
        Assert.assertTrue(hashCode == theUglyDuckling.hashCode());
        hashCode = yogi.hashCode();
        Assert.assertTrue(yogi.hashCode() == hashCode);
        hashCode = memol.hashCode();
        Assert.assertTrue(hashCode == memol.hashCode());
        hashCode = theUglyDuckling.hashCode();
        Assert.assertTrue(hashCode == theUglyDuckling.hashCode());

    }



}
