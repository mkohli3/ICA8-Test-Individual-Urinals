package com.company;

import java.io.*;
import java.util.Arrays;

public class urinalsFunctions {
    public static void getString() throws IOException {
        System.out.println("Not yet implemented");
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
