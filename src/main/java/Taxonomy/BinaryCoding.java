package Taxonomy;

import org.apache.commons.lang.SerializationUtils;

import java.io.*;

public class BinaryCoding implements CodingStrategy<byte[]> {


    public  byte[] serialize(Object object) {

        byte[] bytes = null;

        //Convert object to byte array
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(bos)){
            oos.writeObject(object);
            bytes = bos.toByteArray();
        }
        catch (IOException e){
            System.err.println("Problem converting object!");
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


