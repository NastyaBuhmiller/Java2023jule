package com.company;

public class Program {
    public static void main(String[] args) {
        //В методе main класса Program вызовите метод task1860 класса Library.
        //В качестве аргумента передайте ему строковый литерал "знаниям"
        Library.task1860("знаниям");
        //Вызовите метод task1860 еще раз и передайте ему строковый литерал "цели".
        Library.task1860("цели");
        //Вызовите метод task1860 третий раз с аргументом "результату"
        Library.task1860("результату");
        //В результате запуска метода main класса Program, в консоли должен появиться текс
        //В методе main класса Program вызовите метод task4140 класса Library.
        //Первым аргументом передайте ему строковый литерал "Джеймс". Вторым аргументом передайте строковый литерал "Бонд"
        Library.task4140("Бонд", "Джеймс");
        //Вызовите метод task4140 еще раз и передайте ему строковые литералы "капитан" и "Джек Воробей".
        Library.task4140("Капитан", "Джек Воробей");
        //Вызовите метод task4140 третий раз с аргументами "Александр" "Крюков"
        Library.task4140("Крюков", "Александр");
        //В результате запуска метода main класса Program, в консоли должен появиться текст:


        //В методе main класса Program объявите переменную result для хранения действительных чисел.
        double result;
        //Для каждой строки тестовых данных из задачи напишите в методе main фрагмент кода:
        //Вызовите статический метод task4411 класса Library.
        result = Library.task4411(11.13);
        //Передайте ему в качестве аргументов значения исходных данных для одного теста из задачи.
        //Результат вызова метода запишите в переменную result.
        //Напечатайте в консоль значение переменной result с точностью 4 знака после запятой.
        System.out.printf("%.4f \n ", result);
        //В результате запуска метода main класса Program, в консоли должен появиться текст:

        double result1;
        result1 = Library.task8428(45);
        System.out.println(result1);


        int[] arr = new int[]{9, 8, 9, 1, 1, 5, 1, 1};
        double result2;
        result2 = Library.task3946(arr);
        System.out.println(result2);

        int[] arr1 = new int[]{};
        double result3;
        result3 = Library.task3946(arr1);
        System.out.println(result3);


        System.out.println("task7035");
        int[] num = new int[]{12, 5, 7, 8, 3, 4, 2};
        int result4;
        result4 = Library.findMinIndex(num);
        System.out.println(num[result4]);

        num = new int[]{9, 8, 1, 7};
        result4 = Library.findMinIndex(num);
        System.out.println(num[result4]);

     /*   System.out.println("task4707");
        int[] num1=new int[] {9,8,9,1,1,5,1,1};
        int[] result5;
        int i=0;
        result5=Library.task4707(num1);
        while (i!=num1.length){
            System.out.println(result5[i]);
            i=i+1;
        }

        System.out.println("task3134");
        int[] num2=new int[] {9,8,1,1,5,1,1};
        int[] result6;
        int j=0;
        result6=Library.task4707(num2);
        while (j!=num1.length){
            System.out.println(result5[j]);
            j=j+1;
        }*/
        System.out.println("task3218");

        int[] num4 = new int[]{1, 4, 2, 1};
        int[] result8;
        result8 = Library.task3218(num4, 0);
        int s = num4.length;
        int v = 0;
        while (v != num4.length) {
            System.out.println(result8[v]);
            v = v + 1;
        }
        int[] num3 = new int[]{4, 1, 1, 1};
        int[] result7;
        int k = 0;
        result7 = Library.task3218(num3, 0);
        while (k != num3.length) {
            System.out.println(result7[k]);
            k = k + 1;
        }
        int[] num5 = new int[]{1, 9, 1, 30, 9, 1, 100};
        int[] result9;
        int l = 0;
        result9 = Library.task3218(num5, 0);
        while (l != num5.length) {
            System.out.println(result9[l]);
            l = l + 1;
        }

        System.out.println("task8395");
        Library.task8395(6);
        System.out.println("task8395");
        Library.task8395(1);
        System.out.println("task8395");
        Library.task8395(2);

//        System.out.println("task6988");
//        Library.task__6988();

        System.out.println("task_6988");
        Library.task_6988();

        System.out.println("task__6988");
        String[] num_a = new String[]{"a", "s", "d", "f", "a"};
        String[] num_b = new String[]{"a", "s", "d", "f", "a"};
        int result_;
        result_ = Library.task__6988(num_a, num_b);
        System.out.println(result_);

        System.out.println("task__6988");
        String[] num_a1 = new String[]{"a", "s", "d", "f", "a"};
        String[] num_b1 = new String[]{"a", "s", "d", "f", "g"};
        int result_1;
        result_1 = Library.task__6988(num_a1, num_b1);
        System.out.println(result_1);

        System.out.println("task__6988");
        String[] num_a2 = new String[]{"qwerty", "asdfgh", "zxcvb"};
        String[] num_b2 = new String[]{"qwerty", "asdfgh", "asdfgh"};
        int result_2;
        result_2 = Library.task__6988(num_a2, num_b2);
        System.out.println(result_2);


        System.out.println("task7323");
        Library.task7323(4, 3);

        System.out.println("task2003");
        String[] data = new String[]{"a", "x", "d", "x"};
        Library.task2003(data);

        System.out.println("task2003");
        String[] data1 = new String[]{"a", "s", "d", "m"};
        Library.task2003(data1);

        System.out.println("task_2003");
        String[] data2 = new String[]{"a", "s", "d", "m"};
        double result11;
        result11 = Library.task_2003(data2);
        System.out.println(result11);

        System.out.println("task_2003");
        String[] data3 = new String[]{"q", "a", "z", "w", "s", "x", "e", "d", "c"};
        double result12;
        result12 = Library.task_2003(data3);
        System.out.println(result12);

        System.out.println("task_2003");
        String[] data4 = new String[]{"x", "x", "x", "x", "x", "x", "x", "x"};
        double result13;
        result13 = Library.task_2003(data4);
        System.out.println(result13);

        System.out.println("task8158");
        String first;
        String second;
        Library.task8158("a", "x");

        System.out.println("task8158");
        String first1;
        String second1;
        Library.task8158("y", "d");

        System.out.println("task8158");
        String first2;
        String second2;
        Library.task8158("b", "f");

        System.out.println("task1292");
        String x;
        Library.task1292("a");

        System.out.println("task1292");
        String x1;
        Library.task1292("b");

        System.out.println("task1292");
        String x2;
        Library.task1292("d");

        System.out.println("task7237");
        double temperatureC;
        double result__;
        result__ = Library.task7237(0);
        System.out.println(result__);

        System.out.println("task7237");
        double temperatureC1;
        double result__1;
        result__1 = Library.task7237(-5);
        System.out.println(result__1);

        System.out.println("task7237");
        double temperatureC2;
        double result__2;
        result__2 = Library.task7237(-17.7777);
        System.out.println(result__2);

        System.out.println("task3072");
        int x3;
        int y;
        int z;
        int result__3;
        result__3 = Library.task3072(1, 2, 3);
        System.out.println(result__3);

        System.out.println("task3072");
        int x4;
        int y1;
        int z1;
        int result__4;
        result__4 = Library.task3072(400, 600, 178);
        System.out.println(result__4);

        System.out.println("task3072");
        int x5;
        int y2;
        int z2;
        int result__5;
        result__5 = Library.task3072(150, 0, 250);
        System.out.println(result__5);

        System.out.println("task7035");
        int[] data11 = new int[]{12, 5, 7, 8, 3, 4, 2};
        int result__6;
        result__6 = Library.task7035(data11);
        System.out.println("Метод вернул число " + result__6);


        System.out.println("task7035");
        int[] data12 = new int[]{3, 4, 1, 2, 3, 4, 1, 2, 3, 1, 2};
        int result__7;
        result__7 = Library.task7035(data12);
        System.out.println("Метод вернул число " + result__7);


//        System.out.println("task2173");
//        int[] data13 = new int[]{5,6,7,8,9};
//        int result__8;
//        result__8=Library.task2173(data13);
//        System.out.println(result__8);

        System.out.println("task2173");
        int[] data14 = new int[]{4, 5, 6, 7, 3, 2, 1};
        int result__9;
        result__9 = Library.task2173(data14);
        System.out.println(result__9);

        System.out.println("task_7035");
        int[] data15 = new int[]{12, 5, 7, 8, 3, 4, 2};
        Library.task_7035(data15);

        System.out.println("task8769");
        int[] data16 = new int[]{1,2,3,4,1,2};
        int P;
        int Q;
        Library.task8769(data16,1,3);



        System.out.println("task8769");
        int[] data17 = new int[]{3, 4, 4, 2, 3, 4, 1, 2, 3, 1, 2};
        int P1;
        int Q1;
        Library.task8769(data17,8,10);

        System.out.println("task8769");
        int[] data18 = new int[]{1, 2, 3, 4, 1, 2};
        int P2;
        int Q2;
        Library.task8769(data18,4,2);

        System.out.println("task_8769");
        int[] data19 = new int[]{1, 2, 3, 4, 1, 2};
        int P3;
        int Q3;
        int result44=Library.task_8769(data19,4,2);
        System.out.println(result44);

        System.out.println("task4913");
        double ax;
        double ay;
        double distance;
        double angleDeg;
        Library.task4913(1,2,5,30);

        System.out.println("task1058");
        double Ax;
        double Ay;
        double Bx;
        double By;
        Library.task1058(1,1,3,4);

        System.out.println("task1058");
        double Ax1;
        double Ay1;
        double Bx1;
        double By1;
        Library.task1058(-2,4,8,-10);

        System.out.println("task1058");
        double Ax2;
        double Ay2;
        double Bx2;
        double By2;
        Library.task1058(0,0,0,0);

//        System.out.println("task6589");
//        int a;
//        int b;
//        int c;
//        int d;
//        Library.task6589(0,0,0,0);

        System.out.println("distanceBetween");
        Point a2=new Point();
        a2.x=1;
        a2.y=1;
        Point b2=new Point();
        b2.x=3;
        b2.y=4;
        double dist=Point.distanceBetween(a2,b2);
        System.out.println(dist);

        System.out.println("distanceBetween1");
        Range range=new Range();
        range.to=5;
        range.from=10;
        int dist1=Range.contains(range,7);
        System.out.println(dist1);


        System.out.println("task_4913");
        Point cord=new Point();
        cord.x=1;
        cord.y=2;;
        double distance1;
        double angleDeg1;
        Library.task_4913(cord,5,30);


        System.out.println("cord");
        Point cord1=new Point();
        cord1.x=2;
        cord1.y=3;
        Point.cord(cord1);


        System.out.println("Liquid");
        Liquid a=new Liquid();
        a.volume=1;
        a.temperature=30;
        Liquid b=new Liquid();
        b.volume=3;
        b.temperature=20;
        Liquid vol=Liquid.volume(a,b);
        System.out.println(vol.temperature);
        System.out.println(vol.volume);

        System.out.println("Data");
        Library.data(5,2,2023,20);


        System.out.println("Data");
        Library.data(15,6,2023,15);
    }



}
