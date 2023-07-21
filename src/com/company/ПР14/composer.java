package com.company.ПР14;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class composer {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        File file = new File("H:\\java\\files\\task7788\\composers.csv");
        if (file.exists()) {
            Scanner s = new Scanner(file);
            String birthday;
            String date_of_death;
            if (s.hasNext()) {
                String line = s.nextLine();
                String[] arr = line.split(";");
                birthday = arr[3];
                date_of_death = arr[5];
                int c = 0;
                while (s.hasNext()) {
                    line = s.nextLine();
                    arr = line.split(";");
                    birthday = arr[3];
                    date_of_death = arr[5];
                    c = c + 1;
                    DateTimeFormatter yMdhms = DateTimeFormatter.ofPattern("''yyyy-MM-dd''");
                    DateTimeFormatter dMyhm = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                    LocalDate ldt1 = LocalDate.parse(birthday, yMdhms);
                    LocalDate ldt = LocalDate.parse(date_of_death, yMdhms);
                    long days=ChronoUnit.DAYS.between(ldt1,ldt);
                    long months=ChronoUnit.MONTHS.between(ldt1,ldt);
                    long years=ChronoUnit.YEARS.between(ldt1,ldt);


                    System.out.println(years+arr[7]);
                }
            }
//            DateTimeFormatter yMdhms = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//            DateTimeFormatter dMyhm = DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm a");
//            LocalDateTime ldt1 = LocalDateTime.parse(birthday, yMdhms);
//            LocalDateTime ldt = LocalDateTime.parse(date_of_death, yMdhms);
//            Duration diff = Duration.between(ldt, ldt1);
//            long total = diff.getSeconds();


        }
    }
}

