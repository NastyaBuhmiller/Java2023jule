package com.company.ПР14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task8665 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> arr1 = new ArrayList<>();
        File file = new File("G:\\java\\files\\task8665\\departments.csv");
        File file1 = new File("G:\\java\\files\\task8665\\employees.csv");
        if (file.exists() & file1.exists()) {
            Scanner s = new Scanner(file);
            Scanner f = new Scanner(file1);
            while (s.hasNext()) {
                String line = s.nextLine();
                arr.add(line);
            }
            while (f.hasNext()) {
                String line1 = f.nextLine();
                arr1.add(line1);
            }
            Scanner console = new Scanner(System.in);
            String n = console.nextLine();
            int i = 0;
            String[] departments = arr.get(i).split(",");
            String[] employees = arr1.get(i).split(",");
            String code_departments = null;
            while (i != 9) {
                departments = arr.get(i).split(",");
                if (departments[1].equals(n)) {
                    code_departments = departments[0];
                    System.out.println("Код отдела " + departments[1] + " равен: " + departments[0]);
                }
                i = i + 1;
            }
            i=0;
            while (i != 20) {
                    employees = arr1.get(i).split(",");
                    if (employees[10].equals(code_departments)) {
                        System.out.println(0 + " Имя: " + "'" + employees[1] + "'");
                        System.out.println(" Фамилия: " + "'" + employees[2] + "'");
                        System.out.println(" Телефонный номер: " + "'" + employees[4] + "'");
                    }
                    i = i + 1;
                }
            }
        }
    }

