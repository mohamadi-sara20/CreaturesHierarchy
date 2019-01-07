package Taxonomy;

import java.io.*;

public class BinaryBased implements CodingStrategy<byte[]> {

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


    public Object deserialize(byte[] bytes){
        Creatures creature = null;

        try(FileInputStream f = new FileInputStream("data.ser");
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


