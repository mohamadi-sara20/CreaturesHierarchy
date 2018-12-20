package unitTest;

import Taxonomy.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestEquals{

    private Animals yogi;
    private Animals bamse;
    private Animals winnieThePooh;
    private Animals bear;

    private Humans memol;
    private Humans anette;
    private Humans nell;
    private Humans human;

    private Birds theUglyDuckling;
    private Birds countDokula;
    private Birds donaldDuck;
    private Birds bird;

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
    public void testNormalCases(){
        Assert.assertTrue(yogi.equals(bamse));
        Assert.assertTrue(yogi.equals(winnieThePooh));
        Assert.assertTrue(memol.equals(nell));
        Assert.assertTrue(memol.equals(anette));
        Assert.assertTrue(theUglyDuckling.equals(donaldDuck));
        Assert.assertTrue(theUglyDuckling.equals(countDokula));
        Assert.assertFalse(yogi.equals(bear) && bamse.equals(bear) && winnieThePooh.equals(bear));
        Assert.assertFalse(memol.equals(human) && nell.equals(human) && anette.equals(human));
        Assert.assertFalse(theUglyDuckling.equals(bird) && donaldDuck.equals(bird) && countDokula.equals(bird));

    }

    @Test
    public void testReflexivity(){
        //Animals
        Assert.assertTrue(yogi.equals(yogi));
        //Humans
        Assert.assertTrue(memol.equals(memol));
        //Birds
        Assert.assertTrue(theUglyDuckling.equals(theUglyDuckling));
    }


    @Test
    public void testSymmetry(){
        //Animals
        Assert.assertTrue(yogi.equals(bamse) == bamse.equals(yogi));
        //Humans
        Assert.assertTrue(memol.equals(nell) == nell.equals(memol));
        //Birds
        Assert.assertTrue(theUglyDuckling.equals(donaldDuck) == donaldDuck.equals(theUglyDuckling));

    }

    @Test
    public void testTransitivity(){
        //Animals
        Assert.assertTrue(bamse.equals(winnieThePooh));
        //Humans
        Assert.assertTrue(nell.equals(anette));
        //Birds
        Assert.assertTrue(donaldDuck.equals(countDokula));
    }

    @Test
    public void testConsistency(){

        //Animals
        Assert.assertTrue(yogi.equals(bamse));
        Assert.assertTrue(yogi.equals(bamse));
        bamse.setLanguage(Language.UNLIMITED);
        Assert.assertFalse(yogi.equals(bamse));
        bamse.setLanguage(Language.NA);
        Assert.assertTrue(yogi.equals(bamse));

        //Humans
        Assert.assertTrue(memol.equals(nell));
        Assert.assertTrue(memol.equals(nell));
        nell.setAge(Age.ADOLESCENT);
        Assert.assertFalse(memol.equals(nell));
        nell.setAge(Age.YOUNG);
        Assert.assertTrue(memol.equals(nell));

        //Birds
        Assert.assertTrue(theUglyDuckling.equals(donaldDuck));
        Assert.assertTrue(theUglyDuckling.equals(donaldDuck));
        donaldDuck.setLanguage(Language.UNLIMITED);
        Assert.assertFalse(theUglyDuckling.equals(donaldDuck));
        donaldDuck.setLanguage(Language.LIMITED);
        Assert.assertTrue(theUglyDuckling.equals(donaldDuck));

    }


    @Test(expected = NullPointerException.class)
    public void testNull(){

        //Animals
        Assert.assertFalse(yogi.equals(null));

        yogi = null;
        Assert.assertFalse(yogi.equals(bamse));
        bamse = null;
        Assert.assertFalse(yogi.equals(bamse));

        //Humans
        Assert.assertFalse(memol.equals(null));
        memol = null;
        Assert.assertFalse(memol.equals(nell));
        nell = null;
        Assert.assertFalse(memol.equals(null));

        //Birds
        Assert.assertFalse(theUglyDuckling.equals(null));
        theUglyDuckling = null;
        Assert.assertFalse(theUglyDuckling.equals(donaldDuck));
        donaldDuck = null;
        Assert.assertFalse(theUglyDuckling.equals(donaldDuck));

    }


}



