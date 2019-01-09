package Taxonomy;

public class CodingFactory {


    public static CodingStrategy createSerializer(String type){

        if(type == null)
            return null;

        else if("BinaryCoding".equalsIgnoreCase(type)) {
           return new BinaryCoding();
        }
        else if("XMLCoding".equalsIgnoreCase(type)){
            return new XMLCoding();
        }
        else if("JSONCoding".equalsIgnoreCase(type)){
            return new JSONCoding();
        }

        throw new ExceptionInInitializerError(type + " could not be initialized!");
    }


}
