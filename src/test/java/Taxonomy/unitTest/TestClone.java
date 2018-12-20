package unitTest;

import Taxonomy.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class TestClone {

    private Creatures creature1;
    private Creatures creature2;


    @Parameterized.Parameters
    public static List<Object[]> getParameters() throws CloneNotSupportedException{

        Animals yogi = new Animals("Bear", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.NA, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);
        Humans memol = new Humans("Homo Sapiens", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.UNLIMITED, Hair.HAIR, Age.YOUNG, Gender.FEMALE);
        Birds theUglyDuckling = new Birds("Duck", Reproduction.OVIOPAROUS, Respiration.LUNGS, Language.LIMITED, true, Diet.HERBIVOROUS, true);

        Creatures c1 = yogi.clone();
        Creatures c2 = memol.clone();
        Creatures c3 = theUglyDuckling.clone();

        return Arrays.asList(new Object[][]{
                {yogi, c1},
                {memol, c2},
                {theUglyDuckling, c3}
        });
    }


    public TestClone(Creatures creature1, Creatures creature2){
        this.creature1 = creature1;
        this.creature2 = creature2;
    }

    @Test
    public void testEquality(){
        //Assert.assertTrue(creature1.getSpecies() == creature2.getSpecies() && creature1.getLanguage() == creature2.getLanguage() && creature1.getRespiration() == creature2.getRespiration()
        //&& creature1.getReproduction() == creature2.getReproduction());

        if(creature1.getClass() == Humans.class && creature2.getClass() == Humans.class){
            Humans human1 = (Humans) creature1;
            Humans human2 = (Humans) creature2;

            Assert.assertTrue(human1.getSpecies() == human2.getSpecies() && human1.getReproduction() == human2.getReproduction() && human1.getRespiration() == human2.getRespiration() &&
                    human1.getLanguage() == human2.getLanguage() && human1.getAge() == human2.getAge() && human1.getGender() == human2.getGender());
        }

        if(creature1.getClass() == Animals.class && creature2.getClass() == Animals.class){
            Animals animal1 = (Animals) creature1;
            Animals animal2 = (Animals) creature2;
            Assert.assertTrue(animal1.getSpecies() == animal2.getSpecies() && animal1.getReproduction() == animal1.getReproduction() && animal1.getRespiration() == animal2.getRespiration()
                    && animal1.getLanguage() == animal2.getLanguage() &&animal1.getQuadrupedal() == animal2.getQuadrupedal() && animal1.getTameness() == animal2.getTameness() && animal1.getDiet() == animal2.getDiet());
        }

        if(creature1.getClass() == Birds.class && creature2.getClass() == Birds.class){
            Birds bird1 = (Birds) creature1;
            Birds bird2 = (Birds) creature2;
            Assert.assertTrue(bird1.getSpecies() == bird2.getSpecies() && bird1.getLanguage() == bird2.getLanguage() && bird1.getReproduction() == bird2.getReproduction()
                    && bird1.getRespiration() == bird2.getRespiration() && bird1.getFeathers() == bird2.getFeathers() && bird1.getFly() == bird2.getFeathers() && bird1.getDiet() == bird2.getDiet());
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



