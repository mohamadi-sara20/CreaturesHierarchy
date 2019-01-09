package Taxonomy.unitTest;

import Taxonomy.*;
import org.apache.commons.lang.SerializationUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.*;
import java.util.ArrayList;

public class TestCodingStrategy {
    private Animals yogi;
    private Humans memol;
    private Birds theUglyDuckling;
    private BinaryCoding binaryCoding;
    private XMLCoding xmlCoding;
    private JSONCoding jsonCoding;
    private  byte[] serialized1;
    private  byte[] serialized2;
    private String serializedString1;
    private String serializedString2;

    @Before
    public void initialize(){

        yogi = new Animals("Bear", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.NA, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);
        memol = new Humans("Homo Sapiens", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.UNLIMITED, Hair.HAIR, Age.YOUNG, Gender.FEMALE);
        theUglyDuckling = new Birds("Duck", Reproduction.OVIOPAROUS, Respiration.LUNGS, Language.LIMITED, true, Diet.HERBIVOROUS, true);

        binaryCoding = new BinaryCoding();
        xmlCoding = new XMLCoding();
        jsonCoding = new JSONCoding();

        serialized1 = binaryCoding.serialize(yogi);
        serialized2 = binaryCoding.serialize(yogi);

        serializedString1 = xmlCoding.serialize(yogi);
        serializedString2 = xmlCoding.serialize(yogi);



    }


    @Test
    public void testBinaryConsistency(){

        Animals animal1 = (Animals) binaryCoding.deserialize(serialized1);
        Animals animal2 = (Animals) binaryCoding.deserialize(serialized1);
        Assert.assertTrue(animal1.equals(yogi));
        Assert.assertTrue(animal2.equals(yogi));
        Assert.assertTrue(animal1.equals(animal2));

        serialized1 = binaryCoding.serialize(memol);
        serialized2 = binaryCoding.serialize(memol);
        Humans human1 = (Humans) binaryCoding.deserialize(serialized1);
        Humans human2 = (Humans) binaryCoding.deserialize(serialized2);

        Assert.assertTrue(human1.equals(human2));
        Assert.assertTrue(human1.equals(memol));
        Assert.assertTrue(human2.equals(memol));

        serialized1 = binaryCoding.serialize(theUglyDuckling);
        serialized2 = binaryCoding.serialize(theUglyDuckling);
        Birds bird1 = (Birds) binaryCoding.deserialize(serialized1);
        Birds bird2 = (Birds) binaryCoding.deserialize(serialized2);

        Assert.assertTrue(bird1.equals(bird2));
        Assert.assertTrue(bird1.equals(theUglyDuckling));
        Assert.assertTrue(bird2.equals(theUglyDuckling));


    }

    @Test
    public void testBinaryInstance(){
        Assert.assertTrue(binaryCoding.deserialize(serialized1).getClass() == Animals.class);
        serialized1 =  binaryCoding.serialize(memol);
        Assert.assertTrue(binaryCoding.deserialize(serialized1).getClass() == Humans.class);
        serialized1 = binaryCoding.serialize(theUglyDuckling);
        Assert.assertTrue(binaryCoding.deserialize(serialized1).getClass() == Birds.class);
    }



    @Test
    public void testXmlConsistency(){

        Animals animal1 = (Animals) xmlCoding.deserialize(serializedString1);
        Animals animal2 = (Animals) xmlCoding.deserialize(serializedString2);

        Assert.assertTrue(animal1.equals(yogi));
        Assert.assertTrue(animal2.equals(yogi));
        Assert.assertTrue(animal1.equals(animal2));

        serializedString1 = xmlCoding.serialize(memol);
        serializedString2 = xmlCoding.serialize(memol);
        Humans human1 = (Humans) xmlCoding.deserialize(serializedString1);
        Humans human2 = (Humans) xmlCoding.deserialize(serializedString2);

        Assert.assertTrue(human1.equals(human2));
        Assert.assertTrue(human1.equals(memol));
        Assert.assertTrue(human2.equals(memol));


        serializedString1 = xmlCoding.serialize(theUglyDuckling);
        serializedString2 = xmlCoding.serialize(theUglyDuckling);
        Birds bird1 = (Birds) xmlCoding.deserialize(serializedString1);
        Birds bird2 = (Birds) xmlCoding.deserialize(serializedString2);

        Assert.assertTrue(bird1.equals(bird2));
        Assert.assertTrue(bird1.equals(theUglyDuckling));
        Assert.assertTrue(bird2.equals(theUglyDuckling));

    }

    @Test
    public void testXmlInstance(){

        Assert.assertTrue(xmlCoding.deserialize(serializedString1).getClass() == Animals.class);
        serializedString1 =  xmlCoding.serialize(memol);
        Assert.assertTrue(xmlCoding.deserialize(serializedString1).getClass() == Humans.class);
        serializedString1 = xmlCoding.serialize(theUglyDuckling);
        Assert.assertTrue(xmlCoding.deserialize(serializedString1).getClass() == Birds.class);
    }
    
    
    
    
    @Test
    public void testJsonConsistency(){
        serializedString1 = jsonCoding.serialize(yogi);
        serializedString2 = jsonCoding.serialize(yogi);

        Animals animal1 = (Animals) jsonCoding.deserialize(serializedString1);
        Animals animal2 = (Animals) jsonCoding.deserialize(serializedString2);

        Assert.assertTrue(animal1.equals(yogi));
        Assert.assertTrue(animal2.equals(yogi));
        Assert.assertTrue(animal1.equals(animal2));

        serializedString1 = jsonCoding.serialize(memol);
        serializedString2 = jsonCoding.serialize(memol);
        Humans human1 = (Humans) jsonCoding.deserialize(serializedString1);
        Humans human2 = (Humans) jsonCoding.deserialize(serializedString2);

        Assert.assertTrue(human1.equals(human2));
        Assert.assertTrue(human1.equals(memol));
        Assert.assertTrue(human2.equals(memol));


        serializedString1 = jsonCoding.serialize(theUglyDuckling);
        serializedString2 = jsonCoding.serialize(theUglyDuckling);
        Birds bird1 = (Birds) jsonCoding.deserialize(serializedString1);
        Birds bird2 = (Birds) jsonCoding.deserialize(serializedString2);

        Assert.assertTrue(bird1.equals(bird2));
        Assert.assertTrue(bird1.equals(theUglyDuckling));
        Assert.assertTrue(bird2.equals(theUglyDuckling));

    }

    @Test
    public void testJsonInstance(){
        serializedString1 = jsonCoding.serialize(yogi);
        serializedString2 = jsonCoding.serialize(yogi);


        Assert.assertTrue(jsonCoding.deserialize(serializedString1).getClass() == Animals.class);
        serializedString1 =  jsonCoding.serialize(memol);
        Assert.assertTrue(jsonCoding.deserialize(serializedString1).getClass() == Humans.class);
        serializedString1 = jsonCoding.serialize(theUglyDuckling);
        Assert.assertTrue(jsonCoding.deserialize(serializedString1).getClass() == Birds.class);
    }

    @Test
    public void writeToFile() {
        try (FileOutputStream fos = new FileOutputStream("binarySerialized.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(yogi);
            oos.writeObject(memol);
            oos.writeObject(theUglyDuckling);

        } catch (IOException e) {
            System.err.println(e.getStackTrace());
        }


        try (FileOutputStream fos = new FileOutputStream("xmlSerialized.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(xmlCoding.serialize(yogi));
            //oos.writeChar((int) '\n');
            oos.writeObject(xmlCoding.serialize(memol));
            //oos.writeChar((int) '\n');
            oos.writeObject(xmlCoding.serialize(theUglyDuckling));
            //oos.writeChar((int) '\n');
        } catch (IOException e) {
            System.err.println(e.getStackTrace());
        }

        try (FileOutputStream fos = new FileOutputStream("jsonSerialized.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(jsonCoding.serialize(yogi));
            //oos.writeChar((int) '\n');
            oos.writeObject(jsonCoding.serialize(memol));
            //oos.writeChar((int) '\n');
            oos.writeObject(jsonCoding.serialize(theUglyDuckling));
            //oos.writeChar((int) '\n');
        }
        catch (IOException e){
            System.err.println(e.getStackTrace());
        }
    }

    @Test
    public void readFromFile() {

        try (
                FileInputStream fos = new FileInputStream("xmlSerialized.ser");
                ObjectInputStream ois = new ObjectInputStream(fos)) {
            while (true) {
                System.out.println((xmlCoding.deserialize((ois.readObject().toString()))));
            }
        } catch (EOFException e) {
            System.out.println("No more records!");
        } catch (ClassNotFoundException e) {
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
        } catch (IOException e) {
            System.err.println(e.getStackTrace());
        }


        try (
                FileInputStream fos = new FileInputStream("jsonSerialized.ser");
                ObjectInputStream ois = new ObjectInputStream(fos)) {
            while (true) {
                System.out.println(((ois.readObject())));
            }
        } catch (EOFException e) {
            System.out.println("No more records!");
        } catch (ClassNotFoundException e) {
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
        } catch (IOException e) {
            System.err.println(e.getStackTrace());
        }


        try (
                FileInputStream fos = new FileInputStream("binarySerialized.ser");
                ObjectInputStream ois = new ObjectInputStream(fos)) {
            while (true) {
                System.out.println(ois.readObject());
            }
        } catch (EOFException e) {
            System.out.println("No more records!");
        } catch (ClassNotFoundException e) {
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
        } catch (IOException e) {
            System.err.println(e.getStackTrace());
        }



    }





}