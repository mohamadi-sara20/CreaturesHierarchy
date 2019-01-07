package Taxonomy;
import com.google.gson.*;
import com.google.gson.stream.JsonWriter;
import netscape.javascript.JSObject;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test {


    public static void main(String[] args) {

        Animals yogi = new Animals("Bear", Reproduction.VIVIPAROUS, Respiration.LUNGS, Language.NA, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);
        Animals a = new Animals("BBBB", Reproduction.OVIOPAROUS, Respiration.LUNGS, Language.NA, Hair.HAIR, Diet.CARNIVOROUS, Tameness.WILD, false);

        BinaryBased binaryBased = new BinaryBased();
        byte[] s = binaryBased.serialize(yogi);
        byte[] fff = binaryBased.serialize(a);
        XMLBased xmlBased = new XMLBased();
        String ss = xmlBased.serialize(yogi);

            JsonObject jsonObject = new JsonObject();
            String aa = jsonObject.toString();

    }
}

