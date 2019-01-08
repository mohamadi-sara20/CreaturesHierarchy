package Taxonomy;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BinaryBased implements CodingStrategy<byte[]> {

    /*public byte[] serialize(Object object) {

        byte[] stream = null;

        try (
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
              ObjectOutputStream oos = new ObjectOutputStream(fos)){
            stream = baos.toByteArray();
            oos.writeObject(stream);
        }

        catch (IOException e) {
            e.getStackTrace();
        }

        return stream;
    }
    */

    public  byte[] serialize(Object object) {
        byte[] bytes = null;

        //Convert object to byte array
        //What really happens?
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(bos)){
            oos.writeObject(object);
            bytes = bos.toByteArray();
        }
        catch (IOException e){
            System.err.println("Could not convert object!");
        }


        //Write the object to a file
        try(FileOutputStream fos = new FileOutputStream("binarySerialized.ser");
            ObjectOutputStream os = new ObjectOutputStream(fos)){
            os.writeObject(bytes);
        }
        catch (IOException e){
            System.err.println("Could not write to file!");
        }


        return bytes;
    }




    public Creatures deserialize(byte[] objectBytes){
        Creatures creature = null;
        try(ByteArrayInputStream bis = new ByteArrayInputStream(objectBytes);
            ObjectInputStream ois = new ObjectInputStream(bis)) {

            creature = (Creatures) ois.readObject();
        }

        catch (ClassNotFoundException e){
            System.err.println("Class not found!");
        }
        catch (IOException e){
            System.err.println("Object could not be read!");
        }


        return creature;
    }


}


