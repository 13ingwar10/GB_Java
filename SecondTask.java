package org.example;

/** 2) Вывести все простые числа от 1 до 1000
 */

public class SecondTask {

    static void printPrimeNums() {
        int[] primeNums = {2, 3, 5, 7};                //задаем массив простых чисел до 10, выводим сразу
        for (int i = 0; i < primeNums.length; i++) {
            System.out.print(primeNums[i] + " ");
        }

        int counter = 0;                                //вспомогательный счетчик, если дошел до 4 - число простое
        int lineBreak = 4;                              //вспомогательный счетчик для переноса строки при выводе

        for (int i = 8; i < 1001; i++) {                    //начиная с 8 проверяем все числа путем деления на ...
            counter = 0;                                    //... каждый элемент массива primeNums

            for (int j = 0; j < primeNums.length; j++) {
                if (i % primeNums[j] == 0) {
                    break;
                } else counter++;                           //если число не разделилось на элемент массива primeNums ...
            }                                               //... прибавляем в counter 1

            if (counter == 4) {
                System.out.print(i + " ");
                lineBreak++;
            }

            if (lineBreak == 10) {                          //если LineBreak дошел до 10 - переносим строку
                System.out.println("\n");
                lineBreak = 0;
            }
        }
    }
}
