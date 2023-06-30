package org.example.GB_Java;

import org.w3c.dom.ls.LSOutput;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/** 1) Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */

public class FirstTask {
    private static LinkedList<String> list = new LinkedList<>();

    static void run() {

        greeting();
        boolean getIteration = true;

        while (getIteration) {
            String cmd = inputUser("Enter your command");
            String[] cLine = cmd.toUpperCase().split("~");
            switch (cLine[0]) {
                case "EXIT":
                    getIteration = false;
                    break;
                case "PRINT":
                    System.out.println(list.get(Integer.parseInt(cLine[1])));
                    break;
                case "LIST":
                    while (list.size() > 0) {
                        System.out.println(list.pop());
                    }
                case"REVERSE":
                    System.out.println(reverseList(list));
                default:
                    list.add(cLine[0]);
                    break;
            }
        }

    }

    private static String inputUser(String message) {
        System.out.println(message + "->");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static List<String> reverseList(LinkedList<String> list) {
        List<String> reversedList = new LinkedList<>();
        for (int i = list.size(); i > 0; i--) {
            reversedList.add(list.get(i-1));
        }
        return reversedList;
    }

    private static void greeting(){
        System.out.println("Hi user! There are commands available to use:\n");
        System.out.println("Enter any text to add this to List \n" +
                "*print~number* is to print element *number* of List \n" +
                "*list* is to print List from end to start \n" +
                "*reverse* is to return reversed List \n" +
                "*exit* is to exit program \n" +
                "You should enter command without *");
        System.out.println("\n");
    }
}
