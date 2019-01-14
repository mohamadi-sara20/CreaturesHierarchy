package Taxonomy;

import java.io.IOException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XMLCoding implements CodingStrategy<String>{

    public String serialize(Object object){
        String objectSerialized = "";
        XmlMapper xmlMapper = new XmlMapper();

        try {
            objectSerialized = xmlMapper.writeValueAsString(object);
        }
        catch (IOException e){
            System.err.println("Problem converting to string!");
        }

        return objectSerialized;
    }


    public Object deserialize(String xmlString){
        Creatures creature = null;
        XmlMapper xmlMapper = new XmlMapper();

        try {
            creature = (Creatures) xmlMapper.readValue(xmlString, Creatures.class);
        }

        catch (IOException e){
            System.err.println("Problem converting to Creatures object!!");
        }
        return creature;
    }


}
