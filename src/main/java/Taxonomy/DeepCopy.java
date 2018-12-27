package Taxonomy;

public interface DeepCopy<T> {
    //Copy Constructor
    public T deepCopy();
    public T deepCopyFrom(T obj);

}
