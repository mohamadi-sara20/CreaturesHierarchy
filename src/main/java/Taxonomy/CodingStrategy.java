package Taxonomy;

import java.io.InputStream;

public interface CodingStrategy<T> {
    public T serialize(Object object);
    public Object deserialize(T t);
}

