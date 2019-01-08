package Taxonomy;
public class Test {


    public static void main(String[] args) {

        Animals yogi = new Animals("Bear", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.NA, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);
        Animals a = new Animals("BBBB", Reproduction.OVIOPAROUS, Respiration.LUNGS, Language.NA, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);

        Humans memol = new Humans("Homo Sapiens", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.UNLIMITED, Hair.HAIR, Age.YOUNG, Gender.FEMALE);
        Creatures theUglyDuckling = new Birds("Duck", Reproduction.OVIOPAROUS, Respiration.LUNGS, Language.LIMITED, true, Diet.HERBIVOROUS, true);

BinaryBased binaryBased = new BinaryBased();
            XMLBased xmlBased = new XMLBased();
            JSONBased jsonBased = new JSONBased();
            byte[] s = binaryBased.serialize(yogi);
            //String fff = xmlBased.serializ(theUglyDuckling);
           // System.out.println(xmlBased.deserializ(fff));
        System.out.println(binaryBased.deserialize(s));




    }


}

