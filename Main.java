package org.example.GB_Java;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//        System.out.println("1. Task");
//        int[] array = FirstTask.createArray();              //не пойму что за ерунда, на блокноте все работает прекрасно :(
//        FirstTask.printArray(FirstTask.sortArray(array));   //но написанный метод ничего не сортирует :(
//                                                            //возможно где-то напартачил с рекурсиями, потому что mergeArray я
//                                                            //просчитал на бумаге и он сортирует правильно

        System.out.println("2. Task");
        SecondTask.deleteEvenNums();
        System.out.println("\n");

        System.out.println("3. Task");
        ThirdTask.findMaxMinAverage();
        System.out.println("\n");
    }
}