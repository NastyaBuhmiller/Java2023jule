package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Task7834 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Первый тест");
        String line = s.nextLine();
        arr.add(line);
        System.out.println("В коллекции длиной " + arr.size());
        System.out.println("Значение элемента на индексе " + 0 + " это " + arr.get(0));
//        int i=0;
//        while(arr.size()>i){
//            line = s.nextLine();
//            arr.add(line);
//            System.out.println("В коллекции длиной " + arr.size());
//            System.out.println("Значение элемента на индексе " + 0 + " это " + arr.get(0));
//        }
        if (arr.size() > 5) {
            System.out.println("Значение элемента на индексе " + 2 + " это " + arr.get(2));
        } else {
            System.out.println(" Нет элемента на индексе " + 2);
        }
        if (arr.size() > 5) {

            System.out.println("Значение элемента на индексе " + 3 + " это " + arr.get(3));
        } else {
            System.out.println(" Нет элемента на индексе " + 3);
        }
        if (arr.size() > 5) {
            System.out.println("Значение элемента на индексе " + 5 + " это " + arr.get(5));
        } else {
            System.out.println(" Нет элемента на индексе " + 5);
        }
        System.out.println("Второй тест");
        line = s.nextLine();
        arr.add(line);
        System.out.println("В коллекции длиной " + arr.size());
        System.out.println("Значение элемента на индексе " + 0 + " это " + arr.get(0));
        if (arr.size() > 2 & arr.size() > 5) {
            System.out.println("Значение элемента на индексе " + 2 + " это " + arr.get(2));
        } else {
            System.out.println(" Нет элемента на индексе " + 2);
        }
        if (arr.size() > 5) {

            System.out.println("Значение элемента на индексе " + 3 + " это " + arr.get(3));
        } else {
            System.out.println(" Нет элемента на индексе " + 3);
        }
        if (arr.size() > 5) {
            System.out.println("Значение элемента на индексе " + 5 + " это " + arr.get(5));
        } else {
            System.out.println(" Нет элемента на индексе " + 5);
        }
        System.out.println("Третий тест");
        line = s.nextLine();
        arr.add(line);
        System.out.println("В коллекции длиной " + arr.size());
        System.out.println("Значение элемента на индексе " + 0 + " это " + arr.get(0));
        if (arr.size() > 2 || arr.size() > 5) {
            System.out.println("Значение элемента на индексе " + 2 + " это " + arr.get(2));
        } else {
            System.out.println(" Нет элемента на индексе " + 2);
        }
        if (arr.size() > 2 & arr.size() > 5) {

            System.out.println("Значение элемента на индексе " + 3 + " это " + arr.get(3));
        } else {
            System.out.println(" Нет элемента на индексе " + 3);
        }
        if (arr.size() > 5) {
            System.out.println("Значение элемента на индексе " + 5 + " это " + arr.get(5));
        } else {
            System.out.println(" Нет элемента на индексе " + 5);
        }
        System.out.println("Четвертый тест");
        line = s.nextLine();
        arr.add(line);
        System.out.println("В коллекции длиной " + arr.size());
        System.out.println("Значение элемента на индексе " + 0 + " это " + arr.get(0));
        if (arr.size() > 3 || arr.size() > 5) {
            System.out.println("Значение элемента на индексе " + 2 + " это " + arr.get(2));
        } else {
            System.out.println(" Нет элемента на индексе " + 2);
        }
        if (arr.size() > 3 || arr.size() > 5) {

            System.out.println("Значение элемента на индексе " + 3 + " это " + arr.get(3));
        } else {
            System.out.println(" Нет элемента на индексе " + 3);
        }
        if (arr.size() > 5) {
            System.out.println("Значение элемента на индексе " + 5 + " это " + arr.get(5));
        } else {
            System.out.println(" Нет элемента на индексе " + 5);
        }
        System.out.println("Пятый тест");
        line = s.nextLine();
        arr.add(line);
        System.out.println("В коллекции длиной " + arr.size());
        System.out.println("Значение элемента на индексе " + 0 + " это " + arr.get(0));
        if (arr.size() > 3 || arr.size() > 5) {
            System.out.println("Значение элемента на индексе " + 2 + " это " + arr.get(2));
        } else {
            System.out.println(" Нет элемента на индексе " + 2);
        }
        if (arr.size() > 3 || arr.size() > 5) {

            System.out.println("Значение элемента на индексе " + 3 + " это " + arr.get(3));
        } else {
            System.out.println(" Нет элемента на индексе " + 3);
        }
        if (arr.size() > 5) {
            System.out.println("Значение элемента на индексе " + 5 + " это " + arr.get(5));
        } else {
            System.out.println(" Нет элемента на индексе " + 5);
        }
        System.out.println("Шестой тест");
        line = s.nextLine();
        arr.add(line);
        System.out.println("В коллекции длиной " + arr.size());
        System.out.println("Значение элемента на индексе " + 0 + " это " + arr.get(0));
        if (arr.size() > 3 & arr.size() > 5) {
            System.out.println("Значение элемента на индексе " + 2 + " это " + arr.get(2));
        } else {
            System.out.println(" Нет элемента на индексе " + 2);
        }
        if (arr.size() > 3 & arr.size() > 5) {

            System.out.println("Значение элемента на индексе " + 3 + " это " + arr.get(3));
        } else {
            System.out.println(" Нет элемента на индексе " + 3);
        }
        if (arr.size() > 3 & arr.size() > 5) {
            System.out.println("Значение элемента на индексе " + 5 + " это " + arr.get(5));
        } else {
            System.out.println(" Нет элемента на индексе " + 5);
        }
        System.out.println();
    }


}




