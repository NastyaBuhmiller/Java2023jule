package com.company.ПР14;
import java.util.Scanner;
public class decomposition1392 {
    public static void distinct(String raw1) {
        Scanner s = new Scanner(System.in);
        String raw = s.nextLine();
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
            int temp = num[minIdx];
            num[minIdx] = num[j];
            num[j] = temp;
        }
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        if (num.length % 2 == 0) {
            System.out.println("В массиве четное количество элементов");
            int medianLeft = num.length / 2 - 1;
            int medianRight = num.length / 2;
            double realMedian = ((double) num[medianLeft] + num[medianRight]) / 2;
            System.out.printf("Медиана: (%d + %d) / 2", num[medianLeft], num[medianRight]);
            System.out.printf(" = %.2f\n", realMedian);
        } else {
            System.out.println("В массиве НЕчетное количество элементов");
            int medianIdx = num.length / 2;
            System.out.println("Медиана: " + num[medianIdx]);
        }


    }
}
