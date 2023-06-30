package org.example.GB_Java;
import java.util.*;

/** 4(со звездочкой) Реализовать стэк с помощью массива. Нужно реализовать методы: size(), empty(), push(), peek(), pop().
 */

public class ThirdTask {

    static void arrayAsStack() {
        int[] array = createArray();
        printArray(array);

        System.out.println("size() returns " + size(array));
        System.out.println("empty() returns " + empty(array));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to push into array: ");
        int number = scanner.nextInt();

        array = push(array,number);
        System.out.println("After push(): ");
        printArray(array);

        System.out.println("peek() returns " + peek(array));

        System.out.println("pop() returns " + pop(array));
        System.out.println("After pop(): ");
        array = popEditArray(array);
        printArray(array);
    }

    private static int[] createArray() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Determine size of new array in range [0:10]");
        int size = scanner.nextInt();

        while (size > 10 || size < 0) {
            System.out.println("Error! The size of a new array must be in range [0:10]");
            size = scanner.nextInt();
        }

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }

        return array;
    }

    private static void printArray(int[] array) {
        for (int i = array.length; i > 0; i--) {
            System.out.print(array[i-1] + " ");
        }
        System.out.println("\n");
    }

    private static int size(int[] array) {
        return array.length;
    }

    private static boolean empty(int[] array) {
        return array.length < 1;
    }

    private static int[] push(int[] array, int number) {
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length-1] = number;

        return newArray;
    }

    private static int peek(int[] array) {
        return array[array.length - 1];
    }

    private static int pop(int[] array) {

        return array[array.length - 1];
    }

    private static int[] popEditArray(int[] array) {

        int[] newArray = new int[array.length - 1];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }

        return newArray;
    }
}
