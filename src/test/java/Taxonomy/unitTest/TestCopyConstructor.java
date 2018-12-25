package unitTest;

import Taxonomy.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCopyConstructor {
    private Animals yogi;
    private Animals yogiCopy;
    private Humans memol;
    private Humans memolCopy;
    private Birds theUglyDuckling;
    private Birds theUglyDucklingCopy;

    @Before
    public void initialize() {

        yogi = new Animals("Bear", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.NA, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);
        memol = new Humans("Homo Sapiens", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.UNLIMITED, Hair.HAIR, Age.YOUNG, Gender.FEMALE);
        theUglyDuckling = new Birds("Duck", Reproduction.OVIOPAROUS, Respiration.LUNGS, Language.LIMITED, true, Diet.HERBIVOROUS, true);


        yogiCopy =  new Animals(yogi);
        memolCopy = new Humans(memol);
        theUglyDucklingCopy = new Birds(theUglyDuckling);

    }



    @Test
    public void testReference(){

        Assert.assertNotSame(yogi , yogiCopy);
        Assert.assertNotSame(memol, memolCopy);
        Assert.assertNotSame(theUglyDuckling, theUglyDucklingCopy);

    }


    @Test
    public void testEquality(){

        Assert.assertTrue(yogi.equals(yogiCopy) && yogiCopy.equals(yogi));
        Assert.assertTrue(memol.equals(memolCopy) && memolCopy.equals(memol));
        Assert.assertTrue(theUglyDuckling.equals(theUglyDucklingCopy) && theUglyDucklingCopy.equals(theUglyDuckling));
    }

    @Test
    public void testIdentity(){

        Assert.assertSame(yogi.getClass(), yogiCopy.getClass());
        Assert.assertSame(memol.getClass(), memolCopy.getClass());
        Assert.assertSame(theUglyDuckling.getClass(), theUglyDucklingCopy.getClass());

    }


}


