package Taxonomy;

public interface DeepCopy<T> {
    public T deepCopy();
    public void deepCopyFrom(T obj);

}
