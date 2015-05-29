package com.company;

import java.io.IOException;

/**
 * Created by priyankachavan on 5/7/15.
 */
public class ConcreteRealURLConnection extends CustomURLConnection {

    @Override
    AbstractURL getURLConnection(CustomURL aURL) throws IOException {

        return new RealAbstractURLConnection(aURL);
    }
}
