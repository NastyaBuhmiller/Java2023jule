package com.company.ПР13;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String haystack = "abcdefwxyz";
        String CB;
        CB = s.nextLine();
        String CA;
        CA = s.nextLine();
        int index = haystack.indexOf(CA);
        int index1 = haystack.indexOf(CB);
        System.out.println("Фрагмент " + CA + " начинается на индексе " + haystack.indexOf(CA));
        System.out.println("Фрагмент " + CB + " начинается на индексе " + haystack.indexOf(CB));
        int R = (haystack.indexOf(CA) - haystack.indexOf(CB)) - 1;
        boolean check = haystack.contains(CA);
        boolean check1 = haystack.contains(CB);
        if (!check) {
            System.out.println("Значение CA отсутствует в строке");
        } else if (!check1) {
            System.out.println("Значение CB отсутствует в строке");
        }
        if (check || check1) {
            System.out.println("Между ними находится " + R + " символов");
        }
    }
}

