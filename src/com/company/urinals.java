package com.company;

import java.io.IOException;
import java.util.Scanner;

import static com.company.urinalsFunctions.getString;

//Author - Manan Kohli

public class urinals {

    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter option");
        System.out.println("1. Keyboard Input");
        System.out.println("2. Read from file");
        int option = scn.nextInt();
        if(option == 2) getString();
    }
}
