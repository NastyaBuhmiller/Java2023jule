package com.company.ПР13;
import java.util.Scanner;
public class Task1 {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String needle;
         needle = s.nextLine();
         System.out.println("Записываю значение "+needle+" в переменную needle");
         System.out.println("Записываю значение 'abcdefwxyz' в переменную haystack");
         String haystack="abcdefwxyz";
         boolean check = haystack.contains(needle);
         System.out.println("Вызов метода выглядит так:");
         System.out.println("boolean check = haystack.сontains(needle);");
         if (check){
             System.out.println("Переменная check содержит true, значит фрагмент "+needle+" найден успешно");
         } else {
             System.out.println("Переменная check содержит false, значит фрагмент "+needle+" отсутствует");
         }

        }
    }

