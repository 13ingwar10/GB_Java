package org.example;

import java.util.Scanner;

/** 1) Вычислить сумма чисел от 1 до n
 */

public class FirstTask {
    static int determineNumber() {

        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number in range [-10:10]");
        number = scanner.nextInt();

        while (number > 10 || number < -10) {               // блок проверки ввода пользователя
            System.out.println("Error! Enter number in range [-10:10]");
            number = scanner.nextInt();
        }

        return number;
    }

    static int countSum(int number) {
        int sum = 0;

        if (number > 1) {
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
        } else if (number < 1) {
            for (int i = 1; i >= number; i--) {
                sum += i;
            }
        } else if (number == 1) {
            sum += 1;
        }

        return sum;
    }
}
