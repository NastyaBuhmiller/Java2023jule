package com.company.http;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Films {
    public static void main(String[] args) {
        File film_category = new File("RES/category.dat");
        File id_category = new File("RES/film_category.dat");
        File name_film = new File("RES/film.dat");
        try {
            Scanner s = new Scanner(film_category);
            Scanner h = new Scanner(id_category);
            Scanner g = new Scanner(name_film);
            Scanner k = new Scanner(System.in);
            String value = k.nextLine();
            String[] num;
            String i="";
            ArrayList<String> i_category=new ArrayList<>();
            while (s.hasNext()) {
                String line1 = s.nextLine();
                if (line1.isEmpty()) {
                } else {
                    num = line1.split("\t");
                    if (num.length < 2) {
                    } else {
                        if (num[1].equals(value)) {
                            i = num[0];
                        }
                    }
                }
            }
            while (h.hasNext()) {
                String[] arr;
                String line2 = h.nextLine();
                arr = line2.split("\t");
                if (arr.length > 2 && arr[1].equals(i)) {
                    i_category.add(arr[0]);

                }
            }
            while (g.hasNext()) {
                String[] arr1;
                String line3 = g.nextLine();
                arr1 = line3.split("\t");
                if(arr1.length > 2 && i_category.contains(arr1[0])){
                    System.out.println(arr1[1]);
                }
            }


        } catch (IOException e) {
            System.out.println(film_category.getAbsolutePath());
            e.printStackTrace();
        }
    }
}
