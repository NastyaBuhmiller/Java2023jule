package com.company.ПР9;
import com.company.Library;

import java.util.Scanner;
public class Task20 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] num=new int[] {9,8,1,1,5,1,1};
        int P = s.nextInt();
        int Q = s.nextInt();
        System.out.println("Меняю " + num[P] + " на " + num[Q]);
        int[] result;
        result=Library.swap(num,P,Q);
        int j=0;
        while (j!=num.length){
            System.out.print(result[j]);
            j=j+1;
        }
//        int j=0;
//        int k=0;
//        while (j!=num.length){
//            k=num[P];
//            num[P]=num[Q];
//            System.out.print(num[j]);
//            j=j+1;
//        }
    }


    }

