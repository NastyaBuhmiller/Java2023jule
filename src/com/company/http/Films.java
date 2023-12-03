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
                int i = 0;
                if (line1.isEmpty()) {

                } else {
                    num = line1.split("\t");
                    if (num.length < 2) {

                    } else {
                        while (s.hasNext()) {
                            String[] arr;
                            arr = line2.split("\t");
                            if (num[0].equals(value)) {
                                total = total + arr[0];
                                System.out.println(total);
                                i = i + 1;
                            }
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
