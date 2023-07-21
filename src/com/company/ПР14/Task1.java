package com.company.ПР14;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        String n = console.nextLine();
        File file = new File("H:\\java\\files\\task6175\\test" + n + ".txt");
        if (file.exists()) {//проверяем существует ли файл
            Scanner s = new Scanner(file);
            if (s.hasNext()) {//проверяем есть ли что-то в фале
                String line = s.nextLine();
                System.out.print(line);
                while (s.hasNext()) {// пока в файле что-то есть
                    line = s.nextLine();
                    System.out.print(line + "###");
                }
            } else {
                    System.out.print("Файл пуст");
                }
            } else {
                System.out.print("Файл не существует" + file.getAbsolutePath());
            }
        }
    }


