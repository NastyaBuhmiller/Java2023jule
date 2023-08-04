package com.company.ПР9;

import java.util.ArrayList;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        arr.add(line);
        int i = 0;
        while (arr.size() < 5) {
            line = s.nextLine();
            arr.add(line);
        }
        System.out.println("________");
        while (i < 5) {
           System.out.println(arr.get(i) + " " + i);
            i = i + 1;
        }
    }
}