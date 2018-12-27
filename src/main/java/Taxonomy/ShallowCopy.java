package Taxonomy;

public interface ShallowCopy <T>{

    public T shallowCopy();
    public void shallowCopyFrom(T obj);

}
