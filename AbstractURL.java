package com.company;

import java.net.URLConnection;

/**
 * Created by priyankachavan on 5/7/15.
 */
public abstract class AbstractURL {
    URLConnection connection;
    public abstract long getLastModified();
}
