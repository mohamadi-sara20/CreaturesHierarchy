package Taxonomy;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Type;

public class Json implements Strategy<String> {

    public String serialize(Serializable object){
	        ObjectMapper jsonMapper = new ObjectMapper();
	        String jsonString = "";
            try { jsonString = jsonMapper.writeValueAsString(object); }
            catch (JsonProcessingException e){
                System.err.println("Json Processing Failed!");
            }
            return jsonString;
    }

    public Object deserialize(String jsonString){
        Object object = null;
        ObjectMapper jsonMapper = new ObjectMapper();
        try {
            object = jsonMapper.readValue(jsonString, Creatures.class);

        }
        catch (IOException e){
        System.err.println("Error processing Json!");
        }
        return object;
    }

}
