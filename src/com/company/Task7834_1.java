package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Task7834_1 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Первый тест");
        String line = s.nextLine();
        arr.add(line);
        System.out.println("В коллекции длиной " + arr.size());
        System.out.println("Значение элемента на индексе " + 0 + " это " + arr.get(0));

        while (arr.size() < 6) {
            line = s.nextLine();
            arr.add(line);
            System.out.println("В коллекции длиной " + arr.size());
            System.out.println("Значение элемента на индексе " + 0 + " это " + arr.get(0));
            if ((arr.size() > 2 & arr.size() > 5) || arr.size() > 2 || arr.size() > 5) {
                System.out.println("Значение элемента на индексе " + 2 + " это " + arr.get(2));

            } else {
                System.out.println(" Нет элемента на индексе " + 2);

            }
            if (arr.size() > 3|| arr.size() > 5) {

                System.out.println("Значение элемента на индексе " + 3 + " это " + arr.get(3));
            } else {
                System.out.println(" Нет элемента на индексе " + 3);
            }
            if (arr.size() > 3 & arr.size() > 5) {
                System.out.println("Значение элемента на индексе " + 5 + " это " + arr.get(5));
            } else {
                System.out.println(" Нет элемента на индексе " + 5);
            }

        }
    }
}
