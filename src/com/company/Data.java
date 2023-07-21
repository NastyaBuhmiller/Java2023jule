package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Data {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String line=s.nextLine();
        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        DateTimeFormatter yMdhms=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter dMyhm=DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm a");
        LocalDateTime ldt=LocalDateTime.parse(line,yMdhms);
        LocalDateTime ldt10=ldt.plusSeconds(10000);
        String ldt10str=ldt10.format(dMyhm);
        System.out.println(ldt10str);

        line=s.nextLine();
        DateTimeFormatter ymd=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dmy=DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate dt=LocalDate.parse(line,ymd);
        LocalDate later=dt.plusDays(10);
        String out=dmy.format(later);
        System.out.println(out);

        ZoneId omsk_gmt6=ZoneId.systemDefault();
        ZoneId gmt=ZoneId.of("+00:00");
        long timestamp=dt.atStartOfDay(omsk_gmt6).toEpochSecond();
        //от dt отнимаем смещение времени по таймзоне omsk_gmt6
        //полученную дату конвертируем в число секунд
        System.out.println(timestamp+" количество секунд, прошедшее с 1970-01-01");
    }
}
