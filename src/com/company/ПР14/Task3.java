package com.company.ПР14;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        File file = new File("F:\\java\\files\\task7788\\composers.csv");
        if (file.exists()) {
            Scanner s = new Scanner(file);
            if (s.hasNext()) {
                String line = s.nextLine();
                String[] arr = line.split(";");
                System.out.println(arr[0] + arr[2] + arr[5] + arr[6]);
                int c = 0;
                while (s.hasNext()) {
                    line = s.nextLine();
                    arr = line.split(";");
                    System.out.println(arr[0] + arr[2] + arr[5] + arr[6]);
                    c = c + 1;
                }
                System.out.println("Всего композиторов: " + c);
            }
        }
    }
}