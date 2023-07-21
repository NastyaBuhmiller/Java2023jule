package com.company.ПР9;

import java.util.Scanner;

public class task2 {


        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            if (a != 0) {
                System.out.println("Текущее значение " + a + ". Предыдущее значение отсутствует");
            }
            while (true){
                int b = s.nextInt();
                System.out.println("Текущее значение " + b + ". Предыдущее значение " + a);
                a=b;
            }


        }
    }

