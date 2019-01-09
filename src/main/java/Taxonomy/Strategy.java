package Taxonomy;

import java.io.Serializable;

public interface Strategy <T>{
    public T serialize(Serializable object);
    public Object deserialize(T t);
}
