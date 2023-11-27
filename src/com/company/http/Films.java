package com.company.http;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Films {
    public static void main (String[] args) {
        File f = new File("RES/category.dat");
        File j = new File("RES/film_category.dat");
        try {
            Scanner s = new Scanner(f);
            Scanner h = new Scanner(j);
            Scanner k = new Scanner(System.in);
            String value = k.nextLine();
            String[] num;
            String total = "";
            while (s.hasNext()) {
                String line1 = s.nextLine();
                String line2 = h.nextLine();
                if (line1.isEmpty()) {

                } else {
                    num = line1.split("\t");
                    if (num.length < 2) {

                    } else {
                        if (num[0].equals(value)) {
                            String[] arr;
                            arr = line2.split("\t");
                            total = total + arr[1];
                            System.out.println(total);
                        }
                    }
                }

            }

        } catch (IOException e) {
            System.out.println(f.getAbsolutePath());
            e.printStackTrace();
        }
    }
}
