package com.company.ПР14;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class schedule11 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        File file = new File("H:\\java\\files\\проба\\Расписание уроков - копия.txt");
        if (file.exists()) {
            Scanner s = new Scanner(file);
            if (s.hasNext()) {
                String line = s.nextLine();
                DateTimeFormatter fmt=DateTimeFormatter.ofPattern("EEEE");
                String  day=console.nextLine();
                DateTimeFormatter dMy = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                LocalDate ldt2 = LocalDate.parse(day, dMy);
                System.out.println("Сегодня "+fmt.format(ldt2));
               DayofWeek(s,dMy,ldt2);
            }
        }
    }
    public static void DayofWeek(Scanner s, DateTimeFormatter dMy,LocalDate ldt2){
        String line;

        while (s.hasNext()) {
            line = s.nextLine();
            String[] arr1=arr(line);
            LocalDate ldt=LocalDate.parse(arr1[0],dMy);
            if(ldt2.getDayOfWeek()==ldt.getDayOfWeek()){
                System.out.println("В "+arr1[2]+" будет "+arr1[1]);
            }
        }
    }
    public static String[] arr(String line){
        String[] arr=line.split(";");
        return arr;
    }

}

