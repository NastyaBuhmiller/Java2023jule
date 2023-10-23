package com.company;
import com.company.files.Task8665.Departments;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
/**
 * Created by adm on 23.10.2023.
 */
public class Task9300 {
    public static void main(String[] args) {
        File f = new File("RES/page.html");
        System.out.println(f.getAbsolutePath());
        try {
            if (!f.exists()) {
                f.createNewFile();
            }
            PrintWriter writer = new PrintWriter(f);
            writer.print("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<meta charset=\"utf-8\"/>\n" +
                    "<head/>\n" +
                    "<body>\n" +
                    "<h1>Мой первый векторный рисунок</h1>\n" +
                    "\n" +
                    "<svg width=\"800\" height=\"600\">\n");

            ArrayList<String> x = info_departments();
            int c=0;
            int i=0;
                while(c<x.size()){
                    writer.print(x.get(i));
                    i=i+1;
                    c=c+1;
                }

            writer.print("</svg>\n" +
                        "</body>\n" +
                        "</html>");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();

        }


    }


    public static ArrayList info_departments() throws FileNotFoundException {
        File departments = new File("RES/круги");
        ArrayList<String> bole = new ArrayList<>();
        if (departments.exists()) {
            Scanner s = new Scanner(departments);
            String list;
            String line;
            if (s.hasNext()) {
                String[] arr1;
                while (s.hasNext()) {
                    line = s.nextLine();
                    arr1 = line.split(";");
                    list = "\t<circle cx=\"" + arr1[0] + "\" cy=\"" + arr1[1] + "\" r=\"" + arr1[2] + "\" stroke=\"green\" stroke-width=\"" + arr1[3] + "\" fill=\"yellow\" />\n" + "";
                    bole.add(list);
                }
            }
        }
        return bole;
    }
}

