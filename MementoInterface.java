package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by priyankachavan on 5/7/15.
 */
public interface MementoInterface {
    void setState(List<CustomURL> connections) throws FileNotFoundException, UnsupportedEncodingException;
    List<CustomURL> getState() throws IOException;
}
