package unitTest;

import Taxonomy.*;
import org.junit.Before;
import org.junit.Test;

public class TraverseTest {
    private Creatures[] creatures = new Creatures[3];
    @Before
    public void prepareCreatures() {

        Animals yogi = new Animals("Bear", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.NA, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);
        Humans memol = new Humans("Homo Sapiens", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.UNLIMITED, Hair.HAIR, Age.YOUNG, Gender.FEMALE);
        Birds theUglyDuckling = new Birds("Duck", Reproduction.OVIOPAROUS, Respiration.LUNGS, Language.LIMITED, true, Diet.HERBIVOROUS, true);

        creatures[0] = yogi;
        creatures[1] = memol;
        creatures[2] = theUglyDuckling;

    }

    @Test
    public void traverseCreatures(){
        for(Creatures creature: creatures)
            System.out.println(creature);



    }
}
