package org.example.GB_Java;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

/** 1) Реализовать алгоритм сортировки слиянием(метод взять из Интернета)
 */

public class FirstTask {
        static int[] createArray() {
            Random rnd = new Random();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter array size (not more than 10)");
            int size = scanner.nextInt();
            while (size < 1 || size > 10) {
                System.out.println("Error! Number in range [1:10] expected");
            }

            int[] array = new int[size];

            for (int i = 0; i < array.length; i++) {
                array[i] = rnd.nextInt(20);
                System.out.print(array[i] + " ");
            }
            System.out.println("\n");

            return array;
        }

        static int[] sortArray (int[] array) {

            if (array.length < 2) {
                return array;
            }

            int[] arrayLeft = new int[array.length / 2];

            for (int i = 0; i < arrayLeft.length; i++) {
                arrayLeft[i] = array[i];
            }

            int[] arrayRight = new int[array.length - arrayLeft.length];

            for (int i = array.length/2; i < array.length; i++) {
                arrayRight[i-array.length/2] = array[i];
            }

            arrayLeft = sortArray(arrayLeft);
            arrayRight = sortArray(arrayRight);

            return mergeArray(arrayLeft,arrayRight);
        }

        static int[] mergeArray(int[] arrayLeft, int[] arrayRight) {
            int[] arrayResult = new int[arrayLeft.length + arrayRight.length];
            int indexLeft = 0;
            int indexRight = 0;

            for (int i = 0; i < arrayResult.length; i++) {
                if (indexLeft == arrayLeft.length) {                //проверка не закончился ли левый массив, если да -
                    arrayResult[i] = arrayRight[i - indexLeft];    // - докидываем по порядку элементы в arrayResult
                    indexRight++;
                } else if(indexRight == arrayRight.length){         //проверка не закончился ли правый массив, если да -
                    arrayResult[i] = arrayLeft[i - indexRight];      // - докидываем по порядку элементы в arrayResult
                    indexLeft++;
                } else if (arrayLeft[i - indexLeft] < arrayRight[i - indexRight]) {
                    arrayResult[i] = arrayLeft[i - indexLeft];
                    indexRight++;
                } else {
                    arrayResult[i] = arrayRight[i - indexRight];
                    indexLeft++;
                }

            }
            return arrayResult;
        }

        static void printArray(int[] array) {
            for (int i = 0; i < array.length;i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println("\n");
        }
}
