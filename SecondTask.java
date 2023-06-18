package org.example.GB_Java;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/** 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
 */

public class SecondTask {

    static void bubbleSorting() throws IOException {

        String filename = "Logger.txt";

        Logger logger = Logger.getLogger(SecondTask.class.getName());    //настраиваем логгер

        FileHandler fh = new FileHandler(filename,true);
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        int[] array = {4, 3, 1 ,8 ,6, 4, 9, 3, 7, 5};

        int max = 0;
        int temp = 0;

        for (int i = 0; i < array.length-1; i++) {
            max = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[max]) {
                    max = j;
                }
            }

            temp = array[i];
            array[i] = array[max];
            array[max] = temp;

            logger.info(makeData(array));
        }
    }

    private static String makeData(int[] array) {       //формируем лог для записи в Logger.txt
        String data = "";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            sb.append(array[i] + " ");
        }

        data = sb.toString();
        return data;
    }
}
