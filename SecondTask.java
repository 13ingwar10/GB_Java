package org.example.GB_Java;

import java.io.IOException;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/** 2) Пусть дан произвольный список целых чисел, удалить из него четные числа
 */

public class SecondTask {

    static int[] deleteEvenNums() {

        Random rnd = new Random();
        Integer[] array = new Integer[10];

        System.out.println("Created array: ");                  //формирование случайного массива на 10 чисел
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(20);
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");

        List subArray = new ArrayList(Arrays.asList(array));

        Iterator<Integer> arrayIterator = subArray.iterator();

        while (arrayIterator.hasNext()) {                       //прогон по итератору и удаление всех четных чисел
            Integer number = arrayIterator.next();
            if (number%2 == 0) {
                arrayIterator.remove();
            }
        }

        int[] result = new int[subArray.size()];                //сборка итогового массива
        for (int i = 0; i < result.length; i++) {
            result[i] = (int)subArray.get(i);
        }

        System.out.println("Array after deleting even numbers: ");
        FirstTask.printArray(result);

        return result;
    }
}
