package com.company.ПР14;

import java.awt.*;

public class decomposition {
    public static void distinct(String raw) {
        System.out.println("Новая задача");
        if (raw.length() == 0) {
            System.out.println("Массив пуст");
            return;
        }
        String[] arr = raw.split(" ");
        int[] num = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        for (int j = 0; j < num.length - 1; j++) {
            int minIdx = j;
            for (int i = j + 1; i < num.length; i++) {
                if (num[minIdx] > num[i]) {
                    minIdx = i;
                }
            }
            temp(num, minIdx, j);
        }
        result(num);
        System.out.println();
        int count = count(num);
        int[] distinct = new int[count];
        replacement(num,distinct);

        int y=1;
        for (int i = 0; i < num.length - 1; i++) {
            System.out.printf("Сравниваю %d и %d\n", num[i], num[i + 1]);
            if (num[i] != num[i + 1]) {

                y=replacement1(distinct,y,num,i);
                System.out.println(y);
                }
        }
        System.out.println("Массив различных:");
        for (int i = 0; i < distinct.length; i++) {
            System.out.print(distinct[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Новый тест");

        distinct("9 8 7 6");
        System.out.println("Новый тест 1");
        distinct("9 9 7 7 ");
        System.out.println("Новый тест 2");
        distinct("");
        System.out.println("Новый тест 3");
        distinct("4 4 4 4");

    }

    public static void temp(int[] num, int minIdx, int j) {
        int temp = num[minIdx];
        num[minIdx] = num[j];
        num[j] = temp;
    }

    public static void result(int[] num) {
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    public static int count(int[] num) {
        int count = 1;
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] != num[i + 1]) {
                count++;
            }
        }
        System.out.println("Количество различных значений " + count);
        return count;
    }

    public static void replacement(int[] num, int[] distinct) {

        System.out.printf("Записываю %d на индекс %d массива различных\n", num[0], 0);
        distinct[0] = num[0];
    }
     public static int replacement1(int[] distinct,int di,int[] num, int i){
         System.out.printf("Записываю %d на индекс %d массива различных\n", num[i + 1], di);
         distinct[di] = num[i + 1];
         di++;
         return di;
    }


}


