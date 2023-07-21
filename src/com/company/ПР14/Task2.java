package com.company.ПР14;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Task2 {public static void main(String[] args) throws FileNotFoundException {
    Scanner console = new Scanner(System.in);
    String n = console.nextLine();
    File file = new File("F:\\java\\files\\task4488\\test" + n + ".txt");
    if (file.exists()) {
        Scanner s = new Scanner(file);
        if (s.hasNext()) {
            String line = s.nextLine();
            int c = 0;
            System.out.println(line);
            while (s.hasNext()) {
                line = s.nextLine();
                c = c + 1;
            }
            System.out.print(c);
        } else {
                System.out.print("Файл пуст");
            }
    } else {
        System.out.print("Файл не существует" + file.getAbsolutePath());
    }
    }
}

