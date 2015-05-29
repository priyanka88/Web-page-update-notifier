package com.company;

/**
 * Created by priyankachavan on 5/3/15.
 */
public class TranscriptObserver extends Observer {
    @Override
    public void update(Observable observeThis) {
        observeThis.attach(this);
        System.out.println(observeThis.getState());
    }
}
