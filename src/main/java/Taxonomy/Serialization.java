package Taxonomy;

public abstract class Serialization {
    public abstract Object serialize(Object object, String filename);
    public abstract Object deserialize(String filename);
}
