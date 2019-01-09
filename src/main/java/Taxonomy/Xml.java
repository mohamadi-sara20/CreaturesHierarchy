package Taxonomy;

import com.thoughtworks.xstream.XStream;

import java.io.Serializable;

public class Xml implements Strategy<String>{

    public String serialize(Serializable object) {
        XStream xs = new XStream();
        return xs.toXML(object);
    }

    public Object deserialize(String xml){
        XStream xs = new XStream();
        return xs.fromXML(xml);
    }
}
