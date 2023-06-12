package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("1. Task");
        System.out.println("Sum = " + FirstTask.countSum(FirstTask.determineNumber()));
        System.out.println("\n");

        System.out.println("2. Task");
        SecondTask.printPrimeNums();
        System.out.println("\n");

        System.out.println("3. Task");
        ThirdTask.calculator();
        System.out.println("\n");

        System.out.println("4. Task");
        FourthTask.findEquality();
        System.out.println("\n");

        System.out.println("5. Task");
        FifthTask.turnOverPhrase();
        System.out.println("\n");

        System.out.println("6. Task");
        SixthTask.findEquilibriumPoint();
        System.out.println("\n");

        System.out.println("7. Task");
        SeventhTask.writeData(SeventhTask.enterData());
        System.out.println("\n");

    }
}