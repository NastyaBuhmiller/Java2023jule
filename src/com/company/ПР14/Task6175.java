package com.company.ПР14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task6175 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> arr = new ArrayList<>();
        Scanner console = new Scanner(System.in);
        String n = console.nextLine();
        File file = new File("G:\\java\\files\\task6175\\test" + n + ".txt");
        if (file.exists()) {
            Scanner s = new Scanner(file);
            while (s.hasNext()) {
                String line = s.nextLine();
                arr.add(line);
            }
            int i = 0;
            while (arr.size()>i) {
                System.out.println(arr.get(i));
                i = i + 1;
            }
        }
    }
}
