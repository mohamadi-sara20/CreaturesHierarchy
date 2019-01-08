package Taxonomy;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.*;
import java.io.IOException;
public class JSONCoding implements CodingStrategy<String> {

    public String serialize(Object object){
        String serializedString = "";
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            serializedString = objectMapper.writeValueAsString(object);
        }
        catch (JsonProcessingException e){
            System.out.println("Problem processing json!");}
        return serializedString;
    }


    public Creatures deserialize(String jsonSerialized){


        ObjectMapper objectMapper = new ObjectMapper();
        JsonParser jsonParser = new JsonParser();
        Creatures creature = null;
        try {
            creature = (Creatures) objectMapper.readValue(jsonSerialized, Creatures.class);
        }
        catch (JsonMappingException e){
            System.out.println("Json Mapping Exception!");
        }
        catch (com.fasterxml.jackson.core.JsonParseException e){
            System.out.println("Json parse exception!");
        }
        catch (IOException e){
            System.out.println("Problem converting to Creatures object!!");
        }
        return creature;
    }




}
