package org.alan;

import org.apache.commons.codec.binary.Base64;

import java.util.Arrays;

public class Codec {

    public String encode(String line) {
        Base64 codec = new Base64();
        return Arrays.toString(codec.encode(line.getBytes()));
    }
}
