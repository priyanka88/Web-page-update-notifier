package com.company;

import java.net.URL;

/**
 * Created by priyankachavan on 5/7/15.
 */
public class CustomURL {

    private URL aURL;
    private long time;

    public CustomURL() {

    }

    public CustomURL(URL aURL, long time) {

        this.aURL = aURL;
        this.time = time;
    }

    public URL getaURL() {
        return aURL;
    }

    public void setaURL(URL aURL) {
        this.aURL = aURL;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
    public boolean isDiff(long newTime)
    {
        if(newTime > time)
            return true;
        return false;

    }
}
