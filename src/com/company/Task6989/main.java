package com.company.Task6989;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("G:\\java\\files\\task6989\\composers.csv");
        Scanner console = new Scanner(System.in);
        String n = console.nextLine();
        if (file.exists()) {
            Scanner s = new Scanner(file);
            ArrayList<Composer> arr = new ArrayList<>(); //создаем коллекцию арр с переменными типа композер
            if (s.hasNext()) {
                String line;
                String[] arr1;// создаем массив для элементов из файла
                while (s.hasNext()) {
                    line = s.nextLine();
                    arr1 = line.split(";");// записываем элементы из файла в массив по одному композитору
                    Composer p = new Composer(); //создаем экземпляр класса
                    //заполняем поля класса значениями из файла
                    p.composer_id = arr1[0];
                    p.first_name = arr1[1];
                    p.last_name = arr1[2];
                    p.birth_place = arr1[4];
                    arr.add(p);//и записываем в кол. арр экземпляр класса композер
                }
                int c = 0;
                while (c < arr.size()) {
                  Composer d = arr.get(c);  //заносим значения из коллекции в переменную d
                  c = c + 1;
                        if (d.composer_id.equals(n)) {
                            System.out.println("Имя: " + d.first_name + "Фамилия: " + d.last_name + "Место рождения: " + d.birth_place);
                        }
                }
            }

        }
    }
}

