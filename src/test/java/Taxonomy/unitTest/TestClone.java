package Taxonomy.unitTest;

import Taxonomy.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class TestClone {

    private Creatures creature1;
    private Creatures creature2;

    @Before
    public void initialize(){
        creature2 = creature1.clone();
    }
    @Parameterized.Parameters
    public static List<Object[]> getParameters() throws CloneNotSupportedException{

        Animals yogi = new Animals("Bear", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.NA, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);
        Humans memol = new Humans("Homo Sapiens", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.UNLIMITED, Hair.HAIR, Age.YOUNG, Gender.FEMALE);
        Birds theUglyDuckling = new Birds("Duck", Reproduction.OVIOPAROUS, Respiration.LUNGS, Language.LIMITED, true, Diet.HERBIVOROUS, true);

        return Arrays.asList(new Object[][]{
                {yogi},
                {memol},
                {theUglyDuckling}
        });
    }


    public TestClone(Creatures creature1){
        this.creature1 = creature1;
    }


    @Test
    public void testEquality(){

        if(creature1.getClass() == Humans.class && creature2.getClass() == Humans.class){
            Assert.assertTrue(creature1.equals(creature2));
        }

        if(creature1.getClass() == Animals.class && creature2.getClass() == Animals.class){
           Assert.assertTrue(creature1.equals(creature2));
        }

        if(creature1.getClass() == Birds.class && creature2.getClass() == Birds.class){
            Assert.assertTrue(creature1.equals(creature2));
        }

    }

    @Test
    public void testReference(){
        Assert.assertNotSame(creature1, creature2);
    }


    @Test
    public void testIdentity(){
        Assert.assertSame(creature1.getClass(), creature2.getClass());
        Assert.assertTrue(creature1.getClass().isInstance(creature2) && creature2.getClass().isInstance(creature1));
    }

}

