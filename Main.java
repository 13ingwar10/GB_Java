package org.example.GB_Java;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("1. Task");
        System.out.println(FirstTask.makeWhere());
        System.out.println("\n");

        System.out.println("2. Task");
        SecondTask.bubbleSorting();
        System.out.println("\n");

        System.out.println("3. Task");
        ThirdTask.rebuildJson();
        System.out.println("\n");
//
        System.out.println("4. Task");
        FourthTask.calculator();
        System.out.println("\n");
    }
}