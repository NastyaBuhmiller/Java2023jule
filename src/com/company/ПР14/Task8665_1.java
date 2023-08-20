package com.company.ПР14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task8665_1 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> arr1 = new ArrayList<>();
        File file = new File("D:\\java\\files\\task8665\\departments.csv");
        File file1 = new File("D:\\java\\files\\task8665\\employees.csv");
        if (file.exists()&file1.exists()) {
            Scanner s = new Scanner(file);
            Scanner f = new Scanner(file1);
            while (s.hasNext()&f.hasNext()) {
                String line = s.nextLine();
                arr.add(line);
                String line1 = f.nextLine();
                arr1.add(line1);
            }
            Scanner console = new Scanner(System.in);
            String name_department = console.nextLine();
            int i=0;
            String[] values = arr.get(i).split(",");
            String[] values1 = arr1.get(i).split(",");
            if (values[1].equals(name_department)) {
                System.out.println("Код отдела "+name_department+" равен "+values[0]);
                System.out.println(0+" Имя: "+"'"+values1[1]+"'");
                System.out.println("Фамилия: "+"'"+values1[2]+"'");
                System.out.println("Телефонный номер: "+"'"+values1[4]+"'");
            }

            i=i+1;
        }
    }
}
