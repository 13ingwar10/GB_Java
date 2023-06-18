package org.example.GB_Java;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * 4) 4) К калькулятору из предыдущего ДЗ добавить логирование.
 */
public class FourthTask {

    static void calculator() throws IOException {
        String filename = "FourthTask Log.txt";           //создаем файл для записи логов

        StringBuilder logString = new StringBuilder();    //этот StringBuilder собирает строчку для записи в лог

        Logger logger = Logger.getLogger(SecondTask.class.getName());    //настраиваем логгер

        FileHandler fh = new FileHandler(filename,true);
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

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
                logString.append(a + " + " + b + " = " + result);
                System.out.println(logString.toString());
                break;
            case 2:
                result = a - b;
                logString.append(a + " - " + b + " = " + result);
                System.out.println(logString.toString());
                break;
            case 3:
                result = a * b;
                logString.append(a + " * " + b + " = " + result);
                System.out.println(logString.toString());
                break;
            case 4:
                result = (double) a / b;
                logString.append(a + " / " + b + " = " + result);
                System.out.println(logString.toString());
                break;
        }

        logger.info(logString.toString());          //запись лога

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

