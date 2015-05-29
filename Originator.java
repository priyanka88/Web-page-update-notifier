package com.company;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by priyankachavan on 5/7/15.
 */
public class Originator implements OriginatorInterface {
    List<CustomURL> connections;
    @Override
    public Memento createMemento() {
        return new Memento();
    }

    @Override
    public void setMemento(Memento m) throws FileNotFoundException, UnsupportedEncodingException {
        m.setState(connections);
    }
}
