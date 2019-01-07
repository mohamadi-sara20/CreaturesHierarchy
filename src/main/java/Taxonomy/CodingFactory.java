package Taxonomy;

public class CodingFactory {

    public CodingStrategy makeSerializedReader(){ return new BinaryBased(); };
    public CodingStrategy makeDeserializedReader(){return  new BinaryBased();}


}
