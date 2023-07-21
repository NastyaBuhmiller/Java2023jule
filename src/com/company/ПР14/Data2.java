package com.company.ПР14;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Data2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        File file = new File("F:\\java\\files\\проба\\Даты.txt");
        if (file.exists()) {
            Scanner s = new Scanner(file);
            if (s.hasNext()) {
                String line = s.nextLine();
                String line1;
                long max_days = -1000000;
                while (s.hasNext()) {
                    System.out.println("Текущая дата " + line);
                    line1 = s.nextLine();
                    System.out.println("Предыдущая дата " + line1);
                    DateTimeFormatter dMyhm = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                    LocalDate ldt = LocalDate.parse(line, dMyhm);
                    LocalDate ldt1 = LocalDate.parse(line1, dMyhm);
                    long days = ChronoUnit.DAYS.between(ldt1, ldt);

                    if (days > max_days) {
                        max_days = days;
                    }

                    line = line1;
                }
                System.out.println("Максимальный перерыв между занятиями составляет " + max_days);
            }
        }
    }
}
