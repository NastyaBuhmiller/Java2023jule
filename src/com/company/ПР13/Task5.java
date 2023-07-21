package com.company.ПР13;
import java.util.Scanner;
public class Task5 {public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int CA=Integer.parseInt(s.nextLine());
    int CB=Integer.parseInt(s.nextLine());
    String STR="abcdefwxyz";
    int length=STR.length();
    if (CA<0||CA>length){
        System.out.println("Значение CA должно быть в интервале [0,длина строки)");
    } else if (CB<0||CB>length){
        System.out.println("Значение CB должно быть в интервале [0,длина строки)");
    } else {
        System.out.println("Записываю значение 'abcdefwxyz' в переменную STR");
        if(CA>CB){
            System.out.println("От CB до CA. Вызов метода выглядит так:");
            String result = STR.substring(CB, CA);
            System.out.println(" String result = STR.substring(cb, ca);");
            System.out.println("Переменная result содержит "+result);
        } else if(CB>CA){
            System.out.println("От CA до CB. Вызов метода выглядит так:");
            String result = STR.substring(CA, CB);
            System.out.println(" String result = STR.substring(cb, ca);");
            System.out.println("Переменная result содержит "+result);
        }
    }


}

}
