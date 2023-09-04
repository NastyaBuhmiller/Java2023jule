package com.company.files.Task8665;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Departments> departments1 = info_departments();
        ArrayList<Employees> employees1 = info_employees();
        Scanner console = new Scanner(System.in);
        String name_department = console.nextLine();
        int c = 0;
        String x = null;
        while (c < departments1.size()) {
            Departments d = departments1.get(c);
            c = c + 1;
            if (d.department_name.equals(name_department)) {
                System.out.println("Код отдела: " + d.department_name + " равен " + d.department_id);
                x = d.department_id;
            }
        }
        int i = 0;
        while (i < employees1.size()) {
            Employees d = employees1.get(i);
            i = i + 1;
            int a = 0;
            if (d.department_id.equals(x)) {
                System.out.println(a + "Имя " + d.first_name);
                System.out.println(" Фамилия: " + d.last_name);
                System.out.println(" Телефонный номер: " + d.phone_number);
                a = a + 1;
            }
        }

    }

    //        public static void array (String[]arr, String line) throws FileNotFoundException
//        {//нельзя сделать такой метод, переменная арр1 не инициализирована
//            File departments = new File("D:\\java\\files\\task8665\\departments.csv");
//            Scanner s = new Scanner(departments);
//            line = s.nextLine();
//            arr = line.split(",");
//        }
    public static Departments make_departments(String[] arr) {
        Departments p = new Departments();
        p.department_id = arr[0];
        p.department_name = arr[1];
        return p;
    }

    public static Employees make_employees(String[] arr) {
        Employees p = new Employees();
        p.employee_id = arr[0];
        p.first_name = arr[1];
        p.last_name = arr[2];
        p.phone_number = arr[4];
        p.department_id = arr[10];
        return p;
    }

    public static ArrayList info_departments() throws FileNotFoundException {
        File departments = new File("D:\\java\\files\\task8665\\departments.csv");
        ArrayList<Departments> departments1 = new ArrayList<>();
        if (departments.exists()) {
            Scanner s = new Scanner(departments);
            String line;
            if (s.hasNext()) {
                String[] arr1;
                while (s.hasNext()) {
                    line = s.nextLine();
                    arr1 = line.split(",");
                    Departments p = make_departments(arr1);
                    departments1.add(p);
                }
            }
        }
        return departments1;
    }

    public static ArrayList info_employees() throws FileNotFoundException {
        File employees = new File("D:\\java\\files\\task8665\\employees.csv");
        ArrayList<Employees> employees1 = new ArrayList<>();
        if (employees.exists()) {
            Scanner f = new Scanner(employees);
            if (f.hasNext()) {
                String line;
                String[] arr1;
                while (f.hasNext()) {
                    line = f.nextLine();
                    arr1 = line.split(",");
                    Employees p = make_employees(arr1);
                    employees1.add(p);
                }
            }
        }
        return employees1;
    }
}