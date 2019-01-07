package Taxonomy.unitTest;

import Taxonomy.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestDeepCopy {
    private Animals yogi;
    private Animals bear;
    private Animals a;
    private Humans h;
    private Birds b;
    private Animals yogiCopy;
    private Humans memol;
    private Humans human;
    private Humans memolCopy;
    private Birds theUglyDuckling;
    private Birds bird;
    private Birds theUglyDucklingCopy;

    @Before
    public void initialize() {

        yogi = new Animals("Bear", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.NA, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);
        memol = new Humans("Homo Sapiens", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.UNLIMITED, Hair.HAIR, Age.YOUNG, Gender.FEMALE);
        theUglyDuckling = new Birds("Duck", Reproduction.OVIOPAROUS, Respiration.LUNGS, Language.LIMITED, true, Diet.HERBIVOROUS, true);

        bear = new Animals("Bear", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.LIMITED, Hair.FUR, Diet.CARNIVOROUS, Tameness.DOMESTIC, false);
        human = new Humans("Homo Sapiens", Reproduction.OVIOPAROUS, Respiration.LUNGS, Language.UNLIMITED, Hair.FUR, Age.ADOLESCENT, Gender.FEMALE);
        bird = new Birds("Duck", Reproduction.OVIOPAROUS, Respiration.GILLS, Language.LIMITED, false, Diet.CARNIVOROUS, false);

        yogiCopy =  yogi.deepCopy();

        memolCopy = memol.deepCopy();
        theUglyDucklingCopy = theUglyDuckling.deepCopy();

        yogi.deepCopyFrom(bear);
        memol.deepCopyFrom(human);
        theUglyDuckling.deepCopyFrom(bird);


    }



    @Test
    public void testReference(){

        Assert.assertNotSame(yogi , yogiCopy);
        Assert.assertNotSame(memol, memolCopy);
        Assert.assertNotSame(theUglyDuckling, theUglyDucklingCopy);


        Assert.assertNotSame(yogi, yogi.deepCopy());
        Assert.assertNotSame(memol, memol.deepCopy());
        Assert.assertNotSame(theUglyDuckling, theUglyDuckling.deepCopy());


    }


    @Test
    public void testEquality(){

        Assert.assertTrue(yogi.equals(bear));
        Assert.assertTrue(memol.equals(human));
        Assert.assertTrue(theUglyDuckling.equals(bird));

    }

    
    @Test
    public void testIdentity(){

        Assert.assertSame(yogi.getClass(), yogiCopy.getClass());
        Assert.assertSame(memol.getClass(), memolCopy.getClass());
        Assert.assertSame(theUglyDuckling.getClass(), theUglyDucklingCopy.getClass());

    }


}


