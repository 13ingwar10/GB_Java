package org.example.GB_Java;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("1. Task");
        FirstTask.run();
        System.out.println("\n");

        System.out.println("2. Task");
        SecondTask.makeList();
        System.out.println("\n");

        System.out.println("4. Task");
        ThirdTask.arrayAsStack();

    }
}