package Taxonomy;
public class Test {


    public static void main(String[] args) {

        Animals yogi = new Animals("Bear", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.NA, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);
        Animals a = new Animals("BBBB", Reproduction.OVIOPAROUS, Respiration.LUNGS, Language.NA, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);

        Humans memol = new Humans("Homo Sapiens", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.UNLIMITED, Hair.HAIR, Age.YOUNG, Gender.FEMALE);
        Creatures theUglyDuckling = new Birds("Duck", Reproduction.OVIOPAROUS, Respiration.LUNGS, Language.LIMITED, true, Diet.HERBIVOROUS, true);

BinaryCoding binaryBased = new BinaryCoding();
            XMLCoding xmlBased = new XMLCoding();
            JSONCoding jsonBased = new JSONCoding();
            byte[] s = binaryBased.serialize(yogi);
           // System.out.println(xmlBased.deserializ(fff));

        CodingStrategy xml = CodingFactory.createSerializer("XMlCoding");
        BinaryCoding binaryCoding = new BinaryCoding();
        XMLCoding xmlCoding = new XMLCoding();
        String ss = jsonBased.serialize(yogi);
        System.out.println(ss);
        System.out.println(jsonBased.deserialize(ss));

        Xml xml1 = new Xml();

        xml.serialize(yogi);
        System.out.println(xml.deserialize(xml.serialize(yogi)));
        System.out.println(xmlBased.deserialize(xmlBased.serialize(yogi)));


    }




}

