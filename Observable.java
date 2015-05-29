package com.company;

import java.util.LinkedList;

/**
 * Created by priyankachavan on 5/3/15.
 */
public class Observable {
    protected LinkedList<Observer> observers = new LinkedList<Observer>();
    protected CustomURL state;

    public void setState(CustomURL s) {
        this.state = s;
        notifyObservers();
    }
    public void attach(Observer o)
    {
        observers.add(o);
    }


    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this);
        }
    }

    public CustomURL getState() {
        return state;
    }
}
