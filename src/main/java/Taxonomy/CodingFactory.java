package Taxonomy;

public class CodingFactory {


    public static CodingStrategy createSerializer(String type){


        if(type == null)
            return null;

        else if("BinaryCoding".equalsIgnoreCase(type)) {
            CodingStrategy<byte[]> codingStrategy = new BinaryCoding();
            return codingStrategy;
        }

        else if("XMLCoding".equalsIgnoreCase(type)){
            CodingStrategy<String> codingStrategy = new XMLCoding();
            return codingStrategy;
        }
        else if("JSONCoding".equalsIgnoreCase(type)){
            CodingStrategy<String> codingStrategy = new JSONCoding();
            return codingStrategy;
        }

        throw new ExceptionInInitializerError(type + " could not be initialized!");
    }


}


