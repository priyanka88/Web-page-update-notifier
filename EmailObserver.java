package com.company;

/**
 * Created by priyankachavan on 5/3/15.
 */
public class EmailObserver extends Observer {

    @Override
    public void update(Observable observeThis) {
        observeThis.attach(this);
        SendEmail emailThis = new SendEmail();
        emailThis.sendingMessage();

    }
}
