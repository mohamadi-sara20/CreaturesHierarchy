package Taxonomy;
import com.google.gson.*;


public class Test {


    public static void main(String[] args) {

        Animals yogi = new Animals("Bear", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.NA, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);
        Animals a = new Animals("BBBB", Reproduction.OVIOPAROUS, Respiration.LUNGS, Language.NA, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);

        BinaryBased binaryBased = new BinaryBased();
        byte[] s = binaryBased.serialize(yogi);
        byte[] fff = binaryBased.serialize(a);
        binaryBased.deserialize()

    }
}

