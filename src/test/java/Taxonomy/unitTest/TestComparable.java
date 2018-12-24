package unitTest;

import Taxonomy.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestComparable {
    Animals bamse, winnieThePooh, bear, yogi;
    Humans memol, nell, anette, human;
    Birds theUglyDuckling, donaldDuck, countDokula, bird;


    @Before
    public void prepareArgs() {
        //@Parameterized.Parameters
        //public static List<Object[]> getParameters(){

        //base objects
        yogi = new Animals("Bear", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.NA, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);
        memol = new Humans("Homo Sapiens", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.UNLIMITED, Hair.HAIR, Age.YOUNG, Gender.FEMALE);
        theUglyDuckling = new Birds("Duck", Reproduction.OVIOPAROUS, Respiration.LUNGS, Language.LIMITED, true, Diet.HERBIVOROUS, true);

        //similar for symmetry test
        bamse = new Animals("Bear", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.NA, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);
        nell = new Humans("Homo Sapiens", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.UNLIMITED, Hair.HAIR, Age.YOUNG, Gender.FEMALE);
        donaldDuck = new Birds("Duck", Reproduction.OVIOPAROUS, Respiration.LUNGS, Language.LIMITED, true, Diet.HERBIVOROUS, true);


        //similar for transitivity test
        winnieThePooh = new Animals("Bear", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.NA, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);
        anette = new Humans("Homo Sapiens", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.UNLIMITED, Hair.HAIR, Age.YOUNG, Gender.FEMALE);
        countDokula = new Birds("Duck", Reproduction.OVIOPAROUS, Respiration.LUNGS, Language.LIMITED, true, Diet.HERBIVOROUS, true);


        //dissimilar
        bear = new Animals("Bear", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.LIMITED, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);
        human = new Humans("Homo Sapiens", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.UNLIMITED, Hair.HAIR, Age.ADOLESCENT, Gender.FEMALE);
        bird = new Birds("Duck", Reproduction.OVIOPAROUS, Respiration.LUNGS, Language.LIMITED, true, Diet.CARNIVOROUS, true);


    }


   

    @Test
    public void testReflexivity(){
        //Animals
        Assert.assertEquals(0, yogi.compareTo(yogi));
        //Humans
        Assert.assertEquals(0, memol.compareTo(memol));
        //Birds
        Assert.assertEquals(0, theUglyDuckling.compareTo(theUglyDuckling));
    }


    @Test
    public void testSymmetry(){
        //Animals
        Assert.assertTrue(yogi.compareTo(bamse) == (-1 * bamse.compareTo(yogi)));
        //Humans
        Assert.assertTrue(memol.compareTo(nell) == (-1 * nell.compareTo(memol)));
        //Birds
        Assert.assertTrue(theUglyDuckling.compareTo(donaldDuck) == (-1 * donaldDuck.compareTo(theUglyDuckling)));

    }

    @Test
    public void testTransitivity(){
        //Animals
        Assert.assertEquals(0, bamse.compareTo(winnieThePooh));
        //Humans
        Assert.assertEquals(0, nell.compareTo(anette));
        //Birds
        Assert.assertEquals(0, donaldDuck.compareTo(countDokula));
    }


}
