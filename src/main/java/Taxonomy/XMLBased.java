package Taxonomy;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class XMLBased implements CodingStrategy{
    public String serialize(Object o){

        try (FileOutputStream fos = new FileOutputStream("xmlData.xml");
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             XMLEncoder xmlEncoder = new XMLEncoder(bos);){
            xmlEncoder.writeObject(o);
        }
        catch (IOException e){
            System.err.println(e.getStackTrace());
        }
    return "s";
    }


}
