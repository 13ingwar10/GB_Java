package org.example.GB_Java;

import java.io.IOException;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * 2) Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди,
 * dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
 */

public class SecondTask {

    public static void makeList() {
        List<String> list = new LinkedList<>();

        Random rnd = new Random();

        for (int i = 0; i < rnd.nextInt(10); i++) {
            list.add(Integer.toString(rnd.nextInt(50)));
        }

        System.out.println(list);

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        System.out.println("Enter number of element to move to last: ");
        number = scanner.nextInt();

        enqueue((LinkedList<String>) list,number);
        System.out.println("After enqueue(): \n" + list + "\n");

        System.out.println("dequeue() returns  " + dequeue((LinkedList<String>) list));
        System.out.println("After dequeue(): \n" + list + "\n");

        first((LinkedList<String>) list);
        System.out.println("After first(): \n" + list + "\n");
    }

    private static LinkedList<String> enqueue(LinkedList<String> list, int number) {
        Scanner scanner = new Scanner(System.in);

        while (number > list.size() || number < 1) {
            System.out.println("Error! Enter number of element not more than " + list.size() + " and > 0");
            number = scanner.nextInt();
        }

        list.addLast(list.get(number-1).toString());
        list.remove(number-1);
        return list;
    }

    private static String dequeue(LinkedList<String> list) {

        return list.pollFirst();
    }

    private static void first(LinkedList<String> list) {
        System.out.println("First element = " + list.peekFirst());
    }


}
