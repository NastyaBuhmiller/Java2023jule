package com.company.ПР9;

import java.util.Scanner;

public class Task1 {public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String line;
    line = s.nextLine();

    if (line.isEmpty()) {
        System.out.println("Исходная строка пуста");
    } else {
        int a = s.nextInt();
        String[] arr = line.split("-");
        if (a >= arr.length || a < 0) {
            System.out.println("Число A должно быть в интервале [0, размер массива)");
        } else {
            System.out.println("В массиве длиной "+arr.length);
            System.out.println("на индексе " + a);
            System.out.println("находится элемент со значением " + arr[a]);
        }
    }
}}
