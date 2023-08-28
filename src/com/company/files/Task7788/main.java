package com.company.files.Task7788;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        File file = new File("G:\\java\\files\\task7788\\composers.csv");
        if (file.exists()) {
            Scanner s = new Scanner(file);
            ArrayList<Composer> arr = new ArrayList<>();
            if (s.hasNext()) {
                String line;
                String[] arr1;
                int c = 0;
                while (s.hasNext()) {
                    line = s.nextLine();
                    arr1 = line.split(";");
                    Composer p = new Composer();
                    p.composer_id = arr1[0];
                    p.last_name = arr1[2];
                    p.death_date = arr1[5];
                    p.death_place = arr1[6];
                    arr.add(p);
                    //System.out.println(arr[0] + arr[2] + arr[5] + arr[6]);
                    c = c + 1;
                }
                int i = 0;
                while (i < arr.size()) {
                    Composer d = arr.get(i);
                    System.out.println(d.composer_id + " " + d.last_name + " " + d.death_date + " " + d.death_date);
                    i = i + 1;
                }
                System.out.println("Всего композиторов: " + c);
            }
        }
    }
}
