package Taxonomy;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BinaryBased implements CodingStrategy {

    public byte[] serialize(Object object) {

        byte[] stream = null;

        try (FileOutputStream fos = new FileOutputStream("data.ser");
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
              ObjectOutputStream oos = new ObjectOutputStream(baos)){
            stream = baos.toByteArray();
            objectOutputStream.writeObject(stream);
        }

        catch (IOException e) {
            e.getStackTrace();
        }

        return stream;
    }

    


    public Object deserialize(byte[] stream){
        Creatures creature = null;

        try(FileInputStream f = new FileInputStream("data.ser");
            ByteArrayInputStream bais = new ByteArrayInputStream(stream);
            ObjectInputStream ois = new ObjectInputStream(f);
            ) {
            while (true){
                creature = (Creatures) ois.readObject();
            }
        }

        catch (EOFException e){
            System.out.println("No more records!");
        }

        catch (IOException e){
        }

        catch (ClassNotFoundException e){
        }

        return creature;
    }

}

