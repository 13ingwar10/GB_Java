package org.example;
/**
 * 5) (задание со *) Переверните строку "Welcome to Java course"
 */

public class FifthTask {

    static void turnOverPhrase() {
        String phrase = "Welcome to Java course";       //исходная фраза
        StringBuilder sb = new StringBuilder();

        String[] array = phrase.split(" ");        //раздроблено на слова

        for (int i = array.length-1; i >=0; i--) {      //сборка обратной фразы с помощью StringBuilder
            if (i > 0) {
                sb.append(array[i] + " ");
            } else {
                sb.append(array[i]);
            }
        }

        String result = sb.toString();
        System.out.println(result);
    }
}
