package com.company.ПР14;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Schedule1 {
//    public static void main(String[] args) throws FileNotFoundException {
//        Scanner console = new Scanner(System.in);
//        File file = new File("F:\\java\\files\\проба\\Расписание уроков - копия.txt");
//        if (file.exists()) {
//            Scanner s = new Scanner(file);
//            if (s.hasNext()) {
//                String line = s.nextLine();
//                DateTimeFormatter fmt=DateTimeFormatter.ofPattern("EEEE");
//                String  day=console.nextLine();
//                DateTimeFormatter dMy = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//                LocalDateTime ldt2 = LocalDateTime.parse(day,dMy);
//                System.out.println("Сегодня "+fmt.format(ldt2));
//                while (s.hasNext()) {
//                    line = s.nextLine();
//                    String[] arr=line.split(";");
//                    LocalDateTime ldt=LocalDateTime.parse(arr[0],dMy);
//                    Long next=getNextJobTime(long pLastOccurrenceTime);
//                    if(ldt2.getDayOfWeek()==ldt.getDayOfWeek()){
//                        System.out.println("В "+arr[2]+" будет "+arr[1]);
//                    }
//                }
//            }
//        }
//    }
}
