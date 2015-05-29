package com.company;

import java.io.IOException;

/**
 * Created by priyankachavan on 5/7/15.
 */
public class RealAbstractURLConnection extends AbstractURL {

    public RealAbstractURLConnection(CustomURL aURL) throws IOException {
        connection = aURL.getaURL().openConnection();
    }

    @Override
    public long getLastModified() {
        return connection.getLastModified();
    }
}
