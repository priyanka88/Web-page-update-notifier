package com.company;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

/**
 * Created by priyankachavan on 5/7/15.
 */
public interface OriginatorInterface {
    public Memento createMemento();
    public void setMemento(Memento m) throws FileNotFoundException, UnsupportedEncodingException;
}
