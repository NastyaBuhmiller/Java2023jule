package com.company.Task6170;

import com.company.Task6989.Composer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        String n = console.nextLine();
        File departments = new File("G:\\java\\files\\task6170\\departments.csv");
        File employees = new File("G:\\java\\files\\task6170\\employees.csv");
        ArrayList<Departments> departments1 = new ArrayList<>();
        if (departments.exists()) {
            Scanner s = new Scanner(departments);
            if (s.hasNext()) {
                String line;
                String[] arr1;
                while (s.hasNext()) {
                    line = s.nextLine();
                    arr1 = line.split(",");// записываем элементы из файла в массив по одному композитору
                    Departments p = new Departments(); //создаем экземпляр класса
                    //заполняем поля класса значениями из файла
                    p.department_id = arr1[0];
                    p.department_name = arr1[1];
                    departments1.add(p);//и записываем в кол. арр экземпляр класса композер
                }

            }
        }
        ArrayList<Employees> employees1 = new ArrayList<>();
        if (employees.exists()) {
            Scanner p = new Scanner(employees);

            if (p.hasNext()) {
                String line;
                String[] arr1;
                while (p.hasNext()) {
                    line = p.nextLine();
                    arr1 = line.split(",");// записываем элементы из файла в массив по одному композитору
                    Employees e = new Employees(); //создаем экземпляр класса
                    //заполняем поля класса значениями из файла
                    e.employee_id = arr1[0];
                    e.first_name = arr1[1];
                    e.last_name = arr1[2];
                    e.department_id=arr1[10];
                    employees1.add(e);//и записываем в кол. арр экземпляр класса композер
                }
            }
        }
        int c = 0;
        String department_id=null;
        while (c < employees1.size()) {
            Employees d = employees1.get(c);  //заносим значения из коллекции в переменную d
            c = c + 1;
            if (d.employee_id.equals(n)) {
                System.out.println("Имя: " + d.first_name + "Фамилия: " + d.last_name + "Отдел: ");
                department_id = d.department_id;
            }
        }
        int g = 0;
        while (g < departments1.size()) {
            Departments d = departments1.get(g);  //заносим значения из коллекции в переменную d
            g = g + 1;
            if (d.department_id.equals(department_id)) {
                System.out.println(d.department_name);
            }
        }
    }
}
