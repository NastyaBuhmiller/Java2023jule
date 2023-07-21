package com.company.ПР14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class week1 {public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("EEEE это yyyy-MM-dd");
    String day = s.nextLine();
    DateTimeFormatter dMy = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    LocalDate ldt = LocalDate.parse(day, dMy);
    int ord = ldt.getDayOfWeek().ordinal();
    System.out.println("Нужно отнять " + ord+" чтобы получился понедельник");
    LocalDate mon=ldt.minusDays(ord);
    int i=0;
    while (i<7){
        LocalDate temp=mon.plusDays(i);
        System.out.println(fmt.format(temp));
        i=i+1;
    }
}
}
