package org.example;

import java.util.Scanner;

/** 3) Реализовать простой калькулятор
 */

public class ThirdTask {

        static void calculator() {
            System.out.println("Choose action:" + "\n" + "1. Addition" + "\n" + "2. Substraction" + "\n"
                                + "3. Multiplication" + "\n" + "4. Division" + "\n");

            Scanner scanner = new Scanner(System.in);
            int action = 0;

            action = scanner.nextInt();                     //тут хранится выбранное пользователем мат. действие;

            while (action > 4 || action < 1) {
                System.out.println("Error! Choose action [1:4]");
                action = scanner.nextInt();
            }

            int a;
            int b;
            double result;

            System.out.println("Enter number A:");
            a = scanner.nextInt();

            System.out.println("Enter number B:");
            b = scanner.nextInt();

            switch (action) {
                case 1:
                    result = a + b;
                    System.out.println("A + B = " + result);
                    break;
                case 2:
                    result = a - b;
                    System.out.println("A - B = " + result);
                    break;
                case 3:
                    result = a * b;
                    System.out.println("A * B = " + result);
                    break;
                case 4:
                    result = (double) a / b;
                    System.out.println("A / B = " + result);
                    break;
            }

            int nextStep = 0;
            System.out.println("What to do next?" + "\n" + "1. Count more" + "\n" + "2. Exit" + "\n");

            nextStep = scanner.nextInt();

            while (nextStep > 2 || nextStep < 1) {
                System.out.println("Error! Choose next step [1:2]");
                nextStep = scanner.nextInt();
            }

            switch (nextStep) {
                case 1:
                    calculator();
                    break;
                case 2:
                    System.out.println("Good day!");
                    break;
            }
        }
}
