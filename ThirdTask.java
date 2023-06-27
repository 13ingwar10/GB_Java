package org.example.GB_Java;
import java.util.*;

/** 3) Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
 */

public class ThirdTask {

        static void findMaxMinAverage() {
            Random rnd = new Random();
            List array = new ArrayList();

            for (int i = 0; i < 10; i++) {              //заполняем array list случайными числами
                array.add(rnd.nextInt(20));
            }

            System.out.println("Start array:");
            System.out.println(Arrays.toString(array.toArray()));

            int min = (int)array.get(0);
            int max = (int)array.get(0);
            int sum = 0;
            double average = 0;

            for (int i = 0; i < array.size();i++) {     //пробегаем по листу и находим min, max и sum для расчета average
                if ((int)array.get(i) > max) {          //приводим к явному типу int т.к. не задали при формировании листа
                    max = (int)array.get(i);
                } else if ((int)array.get(i) < min) {
                    min = (int)array.get(i);
                }
                sum = sum + (int)array.get(i);
            }

            average = (double)sum/array.size();

            System.out.println("Min value = " + min);   //формируем вывод
            System.out.println("Max value = " + max);
            System.out.println("Average value = " + average);
        }
}
