package com.company.http;
import java.util.Scanner;

public class Task_1036 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean end = false;
        String[] state = "X_X_X_ _o_o_o".split("_");
        String[] standard = "X_X_ _X_o_o_o".split("_");
        Model1036 model = new Model1036();
        System.out.println(String.join("", state));
        System.out.println("0123456");
        while (!model.canWork() && s.hasNext()) {

            int move = Integer.parseInt(s.next());
            model.logic(move);
            System.out.println(String.join("", model.getState()));


        }
    }
}

