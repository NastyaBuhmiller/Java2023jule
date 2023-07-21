package com.company.ПР13;
import java.util.Scanner;
public class Task7 {public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String code=s.nextLine();
    if (code.length()>13||code.length()<13){
        System.out.println("Некорректная длина штрих-кода");
    } else {
        String length3 = code.substring(0, 3);
        System.out.println("Код страны: " + length3);
        String length6 = code.substring(3, 9);
        System.out.println("Код изготовителя: " + length6);
        String length33 = code.substring(9, 12);
        System.out.println("Код товара: " + length33);
        String length1 = code.substring(12);
        System.out.println("Контрольное число: " + length1);
    }
}
}
