package com.company.ПР13;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String needle;
        needle = s.nextLine();
        System.out.println("Записываю значение " + needle + " в переменную needle");
        String haystack = "abcdefwxyz";
        System.out.println("Записываю значение 'abcdefwxyz' в переменную haystack");
        int index = haystack.indexOf(needle);
        System.out.println("Вызов метода выглядит так:");
        System.out.println("int index = haystack.indexOf(needle);");
        int R = haystack.length() - needle.length() - haystack.indexOf(needle);
        boolean check = haystack.contains(needle);
        if (check) {
            System.out.println("Переменная index содержит 9 значит Фрагмент g" + needle + " находится на индексе " + haystack.indexOf(needle));
            System.out.println("Длина введенного фрагмента " + needle.length());
            System.out.println("После него есть еще " + R + " символов");
        } else
            System.out.println("Переменная index содержит -1 ,значит фрагмент " + needle + " отсутствует в строке");
    }
}
