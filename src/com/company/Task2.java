package com.company;
import java.util.Scanner;
public class Task2 {
    public static void main(int a){
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        if (a!=0){
            System.out.println("Текущее значение "+a+". Предыдущее значение отсутсвует");
        }
        int b = s.nextInt();
        if (b!=0){
            System.out.println("Текущее значение "+b+". Предыдущее значение "+a);
            }
        int b1 = s.nextInt();
        if (b1!=0){
            System.out.println("Текущее значение "+b1+". Предыдущее значение "+b);
        }
        int b2 = s.nextInt();
        if (b2!=0){
            System.out.println("Текущее значение "+b2+". Предыдущее значение "+b1);
        }
        int b3 = s.nextInt();
        if (b3!=0){
            System.out.println("Текущее значение "+b3+". Предыдущее значение "+b2);
        }
        int b4 = s.nextInt();
        if (b4!=0){
            System.out.println("Текущее значение "+b4+". Предыдущее значение "+b3);
        }
        int b5 = s.nextInt();
        if (b5!=0){
            System.out.println("Текущее значение "+b5+". Предыдущее значение "+b4);
        }
        int b6 = s.nextInt();
        if (b6!=0){
            System.out.println("Текущее значение "+b6+". Предыдущее значение "+b5);
        }

    }

}
