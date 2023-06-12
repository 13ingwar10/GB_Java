package org.example;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * 9) (задание со *) Записать в файл следующие данные:
 * Name Surname Age
 */

public class SeventhTask {

    static String enterData() {
        String personalData = "";

        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello user! Enter your Name:");                 //собираем данные пользователя в StringBuilder
        sb.append(scanner.nextLine() + " ");
        System.out.println("Good! Now enter your Surname:");
        sb.append(scanner.nextLine() + " ");
        System.out.println("Ok, and finally enter you Age:");
        sb.append(scanner.nextLine());
        System.out.println("Your personal data is saved, have a nice day!");

        personalData = sb.toString();
        return personalData;
    }

    static void writeData(String data) throws IOException {
        String filename = "List.txt";

        Logger logger = Logger.getLogger(SecondTask.class.getName());    //настраиваем логгер

        FileHandler fh = new FileHandler(filename);
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        logger.info(data);                                              //записываем лог с персональными данными
    }
}
