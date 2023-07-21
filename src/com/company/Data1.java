package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.Duration;

public class Data1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        DateTimeFormatter yMdhms = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter dMyhm = DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm a");
        LocalDateTime ldt = LocalDateTime.parse(line, yMdhms);

        String line1 = s.nextLine();
        LocalDateTime ldt1 = LocalDateTime.parse(line1, yMdhms);

        double r = s.nextInt();


        Duration diff = Duration.between(ldt, ldt1);
        long total = diff.getSeconds();

        double speed = r / total;
        System.out.println("Расстояние от " + ldt + " до " + ldt1 + " со скоростью " + speed);
//        long hours=total/3600;
//        long minutes=(total%3600)/60;
//        long seconds=total%60;
//        System.out.println(hours+":"+minutes+":"+seconds+":");


    }
}
