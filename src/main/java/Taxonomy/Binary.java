package Taxonomy;

import org.apache.commons.lang.SerializationUtils;

import java.io.Serializable;

public class Binary implements Strategy<byte[]>{
    public byte[] serialize(Serializable object) {
        return SerializationUtils.serialize(object);

    }
    public Object deserialize(byte[] bytes){
        return SerializationUtils.deserialize(bytes);
    }


}
