package com.company.ПР14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task6989 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> arr = new ArrayList<>();
        File file = new File("G:\\java\\files\\task6989\\composers.csv");
        if (file.exists()) {
            Scanner s = new Scanner(file);
            while (s.hasNext()) {
                String line = s.nextLine();
                arr.add(line);
            }
            Scanner console = new Scanner(System.in);
            String n = console.nextLine();
            int i=0;
            String[] values = arr.get(i).split(";");

            if (values[0].equals(n)) {
                System.out.println("Имя "+values[1]+"Фамилия: "+values[2]+"Место рождения: "+values[4]);

               }
            values = arr.get(1).split(";");
            if (values[0].equals(n)) {
                System.out.println("Имя "+values[1]+"Фамилия: "+values[2]+"Место рождения: "+values[4]);

            }
            values = arr.get(2).split(";");
            if (values[0].equals(n)) {
                System.out.println("Имя "+values[1]+"Фамилия: "+values[2]+"Место рождения: "+values[4]);

            }
            i=i+1;
        }
    }

}
