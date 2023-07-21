package com.company.ПР14;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("EEEE");
        String day = s.nextLine();
        DateTimeFormatter dMy = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate ldt = LocalDate.parse(day, dMy);

        System.out.println("Сегодня " + fmt.format(ldt));
        LocalDate before = ldt.minusDays(3);
        System.out.println(dMy.format(before));
        LocalDate before1 = ldt.minusDays(2);
        System.out.println(dMy.format(before1));
        LocalDate before2 = ldt.minusDays(1);
        System.out.println(dMy.format(before2));
        LocalDate later2 = ldt.plusDays(1);
        System.out.println(dMy.format(later2));
        LocalDate later1 = ldt.plusDays(2);
        System.out.println(dMy.format(later1));
        LocalDate later = ldt.plusDays(3);
        System.out.println(dMy.format(later));

    }
}
