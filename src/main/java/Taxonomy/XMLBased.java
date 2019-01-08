package Taxonomy;

import java.io.IOException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;


public class XMLBased implements CodingStrategy<String>{



    public String serialize(Object o){
        String serialized = "";
        XmlMapper xmlMapper = new XmlMapper();
        try {
            serialized = xmlMapper.writeValueAsString(o);
        }
        catch (IOException e){
            System.err.println("Problem converting to string!");
        }
        return serialized;
    }

    public Object deserialize(String o){
        Creatures creature = null;
        XmlMapper xmlMapper = new XmlMapper();

        try {

            creature = (Creatures) xmlMapper.readValue(o, Creatures.class);
        }

        catch (IOException e){
            System.err.println("Problem converting to Creatures object!!");
        }
        return creature;
    }


}
