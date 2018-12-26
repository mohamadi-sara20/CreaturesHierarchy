package Taxonomy;

public interface DeepCopy<T> {
    public Creatures deepCopy();
    public Creatures deepCopyFrom(T obj);


}
