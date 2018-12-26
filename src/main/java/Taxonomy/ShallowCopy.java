package Taxonomy;

public interface ShallowCopy <E extends Creatures>{

    public E shallowCopy();
    public E shallowCopyFrom(E obj );
}
