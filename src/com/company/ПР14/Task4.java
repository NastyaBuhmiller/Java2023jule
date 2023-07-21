package com.company.ПР14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        File file = new File("H:\\java\\files\\task7788\\composers.csv");
        if (file.exists()) {
            Scanner s = new Scanner(file);
            if (s.hasNext()) {
                String line = s.nextLine();
                String input = console.nextLine();
                String[] arr = line.split(";");

                while (!input.equals(arr[0])) {
                    line = s.nextLine();
                    arr = line.split(";");
                    }
                if (input.equals(arr[0])){
                    System.out.print("Имя "+arr[1]+"Фамилия: "+arr[2]+"Место рождения: "+arr[4]);
                }
            }
        }
    }
}