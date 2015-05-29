package com.company;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        File p = new File();
        LinkedList ls = p.parseThis("/Users/priyankachavan/Desktop/ip.txt");
        ListIterator<String[]> listIterator = ls.listIterator();
        HashMap<CustomURL,Observable> aMap = new HashMap<CustomURL,Observable>();
        while (listIterator.hasNext()) {
            String[] aLine = listIterator.next();
            URL u = new URL(aLine[0]);

            URLConnection connect = u.openConnection();
            long time = connect.getLastModified();
            CustomURL c = new CustomURL(u, time);
            RealAbstractURLConnection r = new RealAbstractURLConnection(c);
            Observable o = null;
            for (int i = 1; i < aLine.length; i++) {
                Observer e;
                if (aLine[i].equals("mail")) {
                    e = new EmailObserver();

                } else {
                    e = new TranscriptObserver();
                }
                o = new Observable();
                e.update(o);
            }

            aMap.put(c,o);
        }
        // check continuosly
        while(true){
            for (Map.Entry<CustomURL,Observable> entry : aMap.entrySet())
            {
                System.out.println(entry.getKey() + "/" + entry.getValue());
                URL u = entry.getKey().getaURL();
                URLConnection connect = u.openConnection();
                long time = connect.getLastModified();
                if(entry.getKey().isDiff(time))
                    entry.getValue().setState(entry.getKey());
            }
        }
    }
}