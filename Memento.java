package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by priyankachavan on 5/7/15.
 */
public class Memento implements MementoInterface {
    private List<CustomURL> connections;

    @Override
    public void setState(List<CustomURL> connections) throws FileNotFoundException, UnsupportedEncodingException {
        File f = new File();
        for (CustomURL c : connections) {
            f.WriteFile(c);
        }

    }

    public List<CustomURL> getState() throws IOException {
        File f = new File();
        for (CustomURL c : connections) {
            f.parseThis("/Users/priyankachavan/Desktop/op.txt");
        }
        return null;
    }
}
