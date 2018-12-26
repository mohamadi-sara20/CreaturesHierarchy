package Taxonomy;

public interface ShallowCopy <T>{

    public Creatures shallowCopy();
    public Creatures shallowCopyFrom(T obj);
}
