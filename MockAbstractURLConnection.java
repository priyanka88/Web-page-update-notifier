package com.company;

import java.io.IOException;
import java.net.URLConnection;
import java.util.Calendar;

import static org.mockito.Mockito.mock;

/**
 * Created by priyankachavan on 5/7/15.
 */
public class MockAbstractURLConnection extends AbstractURL {

    public MockAbstractURLConnection(CustomURL aURL) throws IOException {
        connection = mock(URLConnection.class);
    }

    @Override
    public long getLastModified() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(cal.getTime());
        cal.add(Calendar.HOUR, -1);
        return cal.getTime().getTime();
    }
}
