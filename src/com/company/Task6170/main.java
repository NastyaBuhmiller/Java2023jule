package com.company.Task6170;

import com.company.files.Task8665.Departments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Departments> departments1 = com.company.files.Task8665.main.info_departments();
        ArrayList<Employees> employees1 = info_employees();
        String Employees = assign_a_value(employees1);
        String Departments = assign(departments1, Employees);
    }

    public static String assign_a_value(ArrayList<Employees> employees1) {
        int c = 0;
        Scanner console = new Scanner(System.in);
        String n = console.nextLine();
        String department_id = null;
        while (c < employees1.size()) {
            Employees d = employees1.get(c);  //заносим значения из коллекции в переменную d
            c = c + 1;
            if (d.employee_id.equals(n)) {
                System.out.println("Имя: " + d.first_name + "Фамилия: " + d.last_name + "Отдел: ");
                department_id = d.department_id;
            }
        }
        return department_id;
    }

    public static ArrayList info_employees() throws FileNotFoundException {
        File employees = new File("D:\\java\\files\\task6170\\employees.csv");
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
                    e.department_id = arr1[10];
                    employees1.add(e);//и записываем в кол. арр экземпляр класса композер
                }
            }
        }
        return employees1;
    }

    public static String assign(ArrayList<Departments> departments1, String Employees) throws FileNotFoundException {
        int g = 0;
        String department_name = null;
        while (g < departments1.size()) {
            Departments d = departments1.get(g);  //заносим значения из коллекции в переменную d
            g = g + 1;
            if (d.department_id.equals(Employees)) {
                department_name = d.department_name;
                System.out.println(department_name);
            }
        }
        return department_name;
    }
}
