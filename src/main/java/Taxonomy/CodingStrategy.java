package Taxonomy;

public interface CodingStrategy<T> {
    public T serialize(Object object);
    //public Object deserialize(byte[] bytes);
}
