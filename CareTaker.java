package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by priyankachavan on 5/7/15.
 */
public class CareTaker implements CareTakerInterface {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
