package com.company;

import java.io.*;
import java.util.Arrays;

public class urinalsFunctions {
    public static void getString() throws IOException {
        int num = 0;
        String Dir = new java.io.File(".").getCanonicalPath();
        String save = "rule.txt";
        File file = new File(Dir, save);
        while(file.exists()) {
            save = "rule" + (num++) +".txt";  //to increment file name after each run
            file = new File(Dir, save);
        }
        BufferedReader reader;
        try {
            String currentPath = new java.io.File(".").getCanonicalPath();
            String urinalPath = currentPath + "\\urinal.dat";
            ifFileExists(urinalPath); //to check if urinal.dat file exists
            reader = new BufferedReader(new FileReader(
                    urinalPath));
            String line = reader.readLine();
            FileWriter wr = new FileWriter("rule.txt");
            ifFileEmpty(line); //to check if file is empty or not
            readFile(line);    //to check if file was read
            while (line != null && !line.equals("-1")) {
                isString(line); //to check if input is string
                isBinary(line); //to check if input contains only 1's and 0's
                wr.write(String.valueOf(countFreeUrinals(line)));
                wr.write("\n");
                line = reader.readLine();
            }
            writeFile("\\rule.txt"); //to check if rule.txt has been written over
            wr.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int isString(String line){
        return 0;
    }
    public static int ifFileExists(String urinalPath) throws IOException {
        String Dir = new java.io.File(".").getCanonicalPath();
        String pathExpected = Dir + "\\urinal.dat";
        if(pathExpected.equals(urinalPath)){
            return 1;
        }
        return 0;
    }
    public static int ifFileEmpty(String line){
        if(line==null){
            return 1;
        }
        return 0;
    }
    public static int readFile(String line){
        if(line==null){
            return 1;
        }
        return 0;
    }
    public static int writeFile(String path){
        BufferedReader reader;
        try {
            String currentPath = new java.io.File(".").getCanonicalPath();
            String rulePath = currentPath + path;
            reader = new BufferedReader(new FileReader(
                    rulePath));
            String line = reader.readLine();
            if(line==null){
                return 0;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 1;
    }
    public static int isBinary(String line){
        for(int i=0;i<line.length();i++){
            if(line.charAt(i)==1 || line.charAt(i)==0) {
                return 0;
            }
        }
        return 1;
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
