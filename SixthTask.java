package org.example;

import java.util.Scanner;

/**
 * 8) (задание со *) Задан массив чисел. Написать программу, которая найдет индекс в массиве,
 * сумма значений до и после которого будет одинаковой
 */


public class SixthTask {

    static void findEquilibriumPoint() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[6];                               //исходный массив

        int counter = 0;                                        //счетчик успешных решений

        System.out.println("Enter 6 numbers using Enter between them");     //пользователь заполняет исходный массив
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        for (int i = 1; i < array.length-1; i++) {                      //проверка левой и правой частей при помощи выделенных методов
            if (sumLeftPart(array, i) == sumRightPart(array, i)) {
                System.out.println("Equilibrium point is found! This is index number " + i);
                printArray(array);
                counter++;
            }
        }

        if (counter == 0) {
            System.out.println("No one equilibrium point is found for array:");
            printArray(array);
        }
    }

    private static int sumLeftPart(int[] array, int index) {            //метод ищет сумму значений слева от индекса
        int sum = 0;

        for (int i = 0; i < index; i++) {
            sum += array[i];
        }

        return sum;
    }

    private static int sumRightPart(int[] array, int index) {           //метод ищет сумму значений справа от индекса
        int sum = 0;

        for (int i = index + 1; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }




}
