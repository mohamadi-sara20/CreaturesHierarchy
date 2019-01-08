package Taxonomy.unitTest;

public class TestTest {

/*

Binary:::

  //Write the object to a file
        try(FileOutputStream fos = new FileOutputStream("binarySerialized.ser");
            ObjectOutputStream os = new ObjectOutputStream(fos)){
            os.writeObject(bytes);
        }
        catch (IOException e){
            System.err.println("Could not write to file!");
        }




XML:::


      //Write the serialized object to a file
        try (FileOutputStream fos = new FileOutputStream("xmlSerialized.ser");
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             XMLEncoder xmlEncoder = new XMLEncoder(bos);) {
            xmlEncoder.writeObject(o);
        }

        catch (IOException e){
            System.err.println(e.getStackTrace());
        }








JSON:::


    try {
            FileOutputStream fos = new FileOutputStream((("JsonSerialized.ser")));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(serializedString);

        }
        catch (IOException e){
            System.err.println("IOE Exception!");
        }




XML::::

public String serializ(Object o){
        XStream xStream = new XStream();
        String serializedObject = xStream.toXML(o);

    return serializedObject;
    }






    public Creatures deserializ(String serializedObject){
        XStream xStream = new XStream();
        return (Creatures) xStream.fromXML(serializedObject);
    }

 */

}
