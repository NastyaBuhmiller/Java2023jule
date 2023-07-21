package com.company;

public class sumexample {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 4, 1, 2};
        System.out.println("sum");
        int result = Library.sum(data);
        System.out.println(result);

        System.out.println("sum1");
        int[] data1 = new int[]{1, 2, 3, 4, 1, 2};
        int X;
        int result1 = Library.sum1(data, 1);
        System.out.println(result1);

        System.out.println("sum2");
        int[] data2 = new int[]{1, 2, 3, 4, 1, 2};
        int X1;
        int result2 = Library.sum1(data2, 3);
        System.out.println(result2);

        System.out.println("sum3");
        int[] data3 = new int[]{1, 2, 3, 4, 1, 2};
        int X2;
        int result3 = Library.sum2(data3, 3);
        System.out.println(result3);

        System.out.println("sum4");
        int[] data4 = new int[]{1, 2, 3, 4, 1, 2};
        int X3;
        int Y;
        int result4 = Library.sum3(data4, 1,4);
        System.out.println(result4);
    }

}
