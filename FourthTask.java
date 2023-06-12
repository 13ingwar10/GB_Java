package org.example;

import java.util.Scanner;

/**
 * 4) (задание со *) Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса,
 * например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить,
 * что его нет.
 */
public class FourthTask {

    static void findEquality() {

        String userQ;               //то, что получаем от пользователя
        String userW;
        String userE;

        String replacedQ;           //после замены ? на число
        String replacedW;
        String replacedE;

        int mathQ = 0;              //после конвертации в int
        int mathW = 0;
        int mathE = 0;

        int counter = 0;            //счетчик успешных решений

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number Q");
        userQ = scanner.next();
        System.out.println("Enter number W");
        userW = scanner.next();
        System.out.println("Enter number E");
        userE = scanner.next();

        for (int i = 0; i < 10; i++) {                              //перебираем все числа от 0 до 9 заменяя ?
            replacedQ = userQ.replace('?', (char) (48 + i)); //char 0 = int 48
            replacedW = userW.replace('?', (char) (48 + i));
            replacedE = userE.replace('?', (char) (48 + i));

            mathQ = Integer.parseInt(replacedQ);
            mathW = Integer.parseInt(replacedW);
            mathE = Integer.parseInt(replacedE);

            if (mathQ + mathW == mathE) {                           //проверяем равенство в каждом проходе цикла
                System.out.println("Solution found: " + replacedQ + " + " + replacedW + " = " + replacedE);
                counter++;
            }
        }

        if (counter == 0) {
            System.out.println("The expression has no solutions:");
            System.out.println(userQ + " + " + userW + " = " + userE);
        }

    }

}

