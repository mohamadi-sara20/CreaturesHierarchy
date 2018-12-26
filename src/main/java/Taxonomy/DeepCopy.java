package Taxonomy;

public interface DeepCopy<T extends Creatures> {
    public T deepCopy();
    public T deepCopyFrom(T obj);



}
