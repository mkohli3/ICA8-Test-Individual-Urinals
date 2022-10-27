package com.company;

import java.io.*;
import java.util.Arrays;

public class urinalsFunctions {
    Boolean goodString( String str ) {  // checks to see if valid string
        System.out.println("Not yet implemented");
        return true;
    }
    public static void getString(){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "E:\\ICA8\\src\\urinal.dat"));
            String line = reader.readLine();
            FileWriter wr = new FileWriter("rule.txt");
            while (line != null && !line.equals("-1")) {
                wr.write(String.valueOf(countFreeUrinals(line)));
                wr.write("\n");
                line = reader.readLine();
            }
            wr.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int countFreeUrinals(String urinals){

        if(urinals.contains("11")) {
            return -1;
        }

        return urinals.replace("010", "-")
                .replace("10", "-")
                .replace("01", "-")
                .replace("1", "-")
                .replace("00", "0")
                .replace("-", "")
                .length();
    }
}
