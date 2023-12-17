package com.company.http;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Films {
    public static void main(String[] args) {

    }
    public static void main_old(String[] args) {
        File category = new File("RES/category.dat");
        File film_category = new File("RES/film_category.dat");
        File name_film = new File("RES/film.dat");
        File id_actor = new File("RES/film_actor.dat");
        File name_actor = new File("RES/actor.dat");
        try {
            Scanner scanner_category = new Scanner(category);
            Scanner scanner_film_category = new Scanner(film_category);
            Scanner scanner_name_film = new Scanner(name_film);
            Scanner scanner_id_actor = new Scanner(id_actor);
            Scanner scanner_name_actor = new Scanner(name_actor);
            Scanner k = new Scanner(System.in);
            String value = k.nextLine();
            String[] num;
            String i="";
            ArrayList<String> i_category=new ArrayList<>();
            while (scanner_category.hasNext()) {
                String line1 = scanner_category.nextLine();
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
            while (scanner_film_category.hasNext()) {
                String[] arr;
                String line2 = scanner_film_category.nextLine();
                arr = line2.split("\t");
                if (arr.length > 2 && arr[1].equals(i)) {
                    i_category.add(arr[0]);

                }
            }
            while (scanner_name_film.hasNext()) {
                String[] arr1;
                String line3 = scanner_name_film.nextLine();
                arr1 = line3.split("\t");
                if(arr1.length > 2 && i_category.contains(arr1[0])){
                    System.out.println(arr1[1]);
                }
            }
            while (scanner_category.hasNext()) {
                String line1 = scanner_category.nextLine();
                if (line1.isEmpty()) {
                } else {
                    num = line1.split("\t");
                    if (num.length < 2) {
                    } else {
                        System.out.println(num[1]);
                    }
                }
            }
            while (scanner_id_actor.hasNext()) {
                String[] arr;
                String line2 = scanner_id_actor.nextLine();
                arr = line2.split("\t");
                if (arr.length > 2 && arr[1].equals(i)) {
                    i_category.add(arr[0]);

                }
            }
            while (scanner_name_actor.hasNext()) {
                String[] arr1;
                String line3 = scanner_name_actor.nextLine();
                arr1 = line3.split("\t");
                if (arr1.length > 2 && i_category.contains(arr1[0])) {
                    System.out.println(arr1[1]);
                }
            }
        } catch (IOException e) {
            System.out.println(film_category.getAbsolutePath());
            e.printStackTrace();
        }
    }
}
