package com.company;

import java.io.*;
import java.util.LinkedList;
import java.util.*;
/**
 * Created by priyankachavan on 5/3/15.
 */
public class File {
    public LinkedList<String[]> parseThis(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));

        String line = null;
        LinkedList<String[]> lines = new LinkedList<String[]>();

        String[] command;
        while ((line = br.readLine()) != null) {
            command = line.split(" ");
            String website = command[0];
            String ObservingType1 = command[1];
            if (command.length > 2) {
                String ObservingType2 = command[2];

            }
            lines.add(command);
        }
        return lines;
    }
    public boolean WriteFile(CustomURL aURL) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("/Users/priyankachavan/Desktop/op.txt", "UTF-8");
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return false;
        }
        writer.println(aURL.getaURL() + "  " + aURL.getTime());

      //  writer.println("The second line");
        writer.close();
        return false;
    }
    public List<CustomURL> readFile(String fileName ) {
        return null;
    }
}