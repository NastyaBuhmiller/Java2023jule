package Task_tinkoff;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int time = s.nextInt();//время, которое вводит пользователь
        int str_max = 2;
        int stlb_max = 2;
        int i = 0;
        int j = 0;
        int number = 1;
        int k = 2 + 1;

        if (s.hasNext()) {
            if (1 < time & time < 100000000) {
                while (time > number) {
                    int[][] square = new int[str_max][stlb_max];
                    square[i][j] = number;
                    square[i][j + 1] = number + 1;
                    square[i + 1][j] = number + 1;
                    str_max++;
                    stlb_max++;
                    i++;
                    j++;
                    number++;
                    k++;
                    System.out.println("Привет, тинкофф");
                }
            }
            if (time == number) {
                System.out.println(k);
            }
        }
    }
}


