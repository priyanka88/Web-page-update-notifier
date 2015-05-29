package com.company;

import java.io.IOException;
/**
 * Created by priyankachavan on 5/7/15.
 */
public abstract class CustomURLConnection {

    abstract AbstractURL getURLConnection(CustomURL aURL) throws IOException;

}

