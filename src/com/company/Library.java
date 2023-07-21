package com.company;

public class Library {
    //В классе Library реализуйте публичный статический метод task1860.
    //Он принимает в качестве аргумента 1 строку.
    //В теле метода task1860 напечатайте в консоль решение задачи, используя значение аргумента в качестве исходных данных.
    public static void task1860(String str) {
        System.out.println("Мы стремимся к " + str);
    }

    //В классе Library реализуйте публичный статический метод task4140.
//Он принимает в качестве аргумента 1 строку.
//В теле метода task4140 напечатайте в консоль решение задачи, используя значения аргументов в качестве исходных данных.
    public static void task4140(String lastName, String firstName) {
        System.out.println("Меня зовут " + lastName + ", " + firstName + " " + lastName);
    }

    //В классе Library реализуйте публичный статический метод task4411.
    public static double task4411(double x) {
        double tmp;
        tmp = x + 7;
        return tmp;
    }
//Он принимает в качестве аргумента 1 действительное число и возвращает действительное число.
//В теле метода верните результат решения задачи, используя значение аргумента в качестве исходных данных.

    public static double task8428(int angleDegree) {
        double angleRadian;
        angleRadian = angleDegree * Math.PI / 180;
        return angleRadian;
    }

    public static double task3946(int[] num) {
        if (num.length == 0) {
            return 0;
        }
        double sum = 0;
        double sred;
        int i = 0;
        while (i != num.length) {
            sum = sum + num[i];
            i = i + 1;
        }
        sred = sum / num.length;
        return sred;
    }


    public static int findMinIndex(int[] num) {
        if (num.length == 0) {
            return 0;
        }
        int min = 0;
        for (int i = 1; i < num.length; i++) {
            if (num[i] < num[min]) {
                min = i;

            }

        }
        return min;
    }

//    public static int task7035(int[] num) {
//        if (num.length == 0) {
//            return 0;
//        }
//        int min = num[0];
//        for (int i = 1; i < num.length; i++) {
//            if (num[i] < min) {
//                min = num[i];
//
//            }
//
//        }
//        return min;
//    }

   /* public static int[] task4707(int[] num) {
        if (num.length == 0) {
            return null;
        }
        int imin;
        imin = Library.findMinIndex(num);

*/

     /*   }
        int k = 0;
        if (num[0] > min) {
            k = num[0];
            num[0] = min;
        }
        for (int i = 1; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        if (num[1] > min) {
            k = num[1];
            num[1] = min;
        }
        for (int i = 1; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        if (num[2] > min) {
            k = num[2];
            num[2] = min;
        }
        for (int i = 1; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        if (num[3] > min) {
            k = num[3];
            num[3] = min;
        }
*/
//        int k=0;
//        int j=0;
//        while (num[j]>min){
//            k=num[j];
//            num[j]=min;
//            j=j+1;
//        }
     /*   return num;
}*/

    public static int[] swap(int[] num, int P, int Q) {

        if (num.length == 0) {
            return null;
        }
        System.out.println("Меняю " + num[P] + " на " + num[Q]);

        int h = num[P];
        num[P] = num[Q];
        num[Q] = h;
        return num;
    }


    public static int[] task3218(int[] num, int i) {

        if (num.length == 0) {
            return null;
        }
        int a = 0;
        System.out.println(" Шаг " + a);
        int s = 0;
        while (s < num.length) {
            i = 0;
            while (num.length > i + 1) {

                if (num[i] > num[i + 1]) {

                    Library.swap(num, i, i + 1);
                    i = i + 1;
                } else {

                    System.out.println(" Оставляю " + num[i] + " и " + num[i + 1]);
                    i = i + 1;
                }

            }
            a = a + 1;
            s = s + 1;
//        System.out.println(" Шаг " + a);
//        while (num.length > i + 1) {
//            if (num[i] > num[i + 1]) {
//                Library.swap(num, i, i + 1);
//                i = i + 1;
//            } else {
//
//                System.out.println(" Оставляю " + num[i] + " и " + num[i + 1]);
//                i = i + 1;
//            }
//
//        }
//        a = a + 1;
//        i = 0;
//        System.out.println(" Шаг " + a);
//        while (num.length > i + 1) {
//
//            if (num[i] > num[i + 1]) {
//
//                Library.swap(num, i, i + 1);
//                i = i + 1;
//            } else {
//
//                System.out.println(" Оставляю " + num[i] + " и " + num[i + 1]);
//                i = i + 1;
//            }

//        }
//        a = a + 1;
//        i = 0;
//        System.out.println(" Шаг " + a);
//        while (num.length > i + 1) {
//
//            if (num[i] > num[i + 1]) {
//
//                Library.swap(num, i, i + 1);
//                i = i + 1;
//            } else {
//
//                System.out.println(" Оставляю " + num[i] + " и " + num[i + 1]);
//                i = i + 1;
//            }
//        }
        }
        return num;
    }


    public static void task8395(int width) {
        String[] num = new String[]{"a", "b", "c", "d", "e", "f", "g", "h"};
        if (num.length == 0) {
            return;
        }
        int a = 0;

        while (a < num.length) {
            int i = 0;
            while (i < width) {
                System.out.print(num[a]);
                i = i + 1;
            }
            System.out.println();
            a = a + 1;
        }

    }

    //    public static int task6988() {
//        String[] num = new String[]{"a", "s", "d", "f", "a"};
//        String[] arr = new String[]{"a", "s", "d", "f", "g"};
//        int count = 0;
//        if (num.length == 0 || arr.length == 0) {
//            return -1;
//        }
//        int i = 0;
//        while (i < num.length || i < arr.length) {
//            if (num[i].equals(arr[i])) {
//                System.out.println("Массивы одинаковы");
//
//            }
//            i = i + 1;
//        }
//           if (!num[i].equals(arr[i])){
//            System.out.println("Массивы начинают различаться на индексе " + i);
//            count = count + 1;
//        }
//
//        return i;
//    }
    public static int task_6988() {
        String[] num = new String[]{"a", "s", "d", "f", "a"};
        String[] arr = new String[]{"a", "s", "d", "f", "g"};
        int count = 0;
        if (num.length == 0 || arr.length == 0) {
            return -1;
        }
        int i = 0;
        while (i < num.length || i < arr.length) {
            if (num[i].equals(arr[i])) {

            } else {
                System.out.println("Массивы начинают различаться на индексе " + i);
                count = count + 1;
            }
            i = i + 1;
        }
        if (count == 0) {
            System.out.println("Массивы одинаковы");
        }
        return i;
    }

    public static int task__6988(String[] num_a, String[] num_b) {
        int count = 0;
        if (num_a.length == 0 || num_b.length == 0) {
            return -1;
        }
        int i = 0;
        while (i < num_a.length || i < num_b.length) {
            if (num_a[i].equals(num_b[i])) {

            } else {
                System.out.println("Массивы начинают различаться на индексе " + i);
                count = count + 1;
            }
            i = i + 1;
        }
        if (count == 0) {
            System.out.println("Массивы одинаковы");
        }
        return i;
    }


    //    public static String[] task7323(int width, int diff) {
//        String[] num = new String[]{"#"};
//        int i = 0;
//        int y = 0;
//        int count = 0;
//        while (i < num.length&y<num.length) {
//            if (i < width) {
//                System.out.println("Первая строка 4 символа");
//                System.out.println(num[count]);
//                i = i + 1;
//            } else if (y < diff) {
//                System.out.println("Первая строка 4 символа");
//                System.out.println(num[count]);
//                y = y + 1;
//            }
//            count = count + 1;
//            }
//        return num;
//    }
    public static void task7323(int width, int diff) {
        int i = 0;
        int y = 0;
        int count = 0;
        System.out.println("Первая строка " + width + " символа");
        while (i < width) {
            System.out.print("#");
            i = i + 1;

        }
        diff = diff + width;
        System.out.println("Вторая строка " + diff + " символа");
        while (y < diff) {
            System.out.print("#");
            y = y + 1;
        }

        count = count + 1;


    }

    public static void task2003(String[] data) {
        int i = 0;
        double result = Library.task_2003(data);
        System.out.println(result);
    }

    public static double task_2003(String[] data) {
        int i = 0;
        int count = 0;
        while (i < data.length) {
            if (data[i].equals("x")) {
                System.out.println("Символ 'х' найден на позиции " + i + "'");
                count = count + 1;
                return i;
            } else {
                //не нашел
            }
            i = i + 1;
        }
        System.out.println("Количество символов где найден " + count);
        if (count == 0) {
            System.out.println("Символ 'х' отсутствует");
        }
        return -1;
    }


    public static void task8158(String first, String second) {
        String[] data = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "a", "b", "c", "d", "e"};
        int i = 0;
        int y = 0;
        int count = 0;
        int count_ = 0;
        while (i < data.length) {
            if (data[i].equals(first)) {
                System.out.println("Символ " + first + " найден");
                count = count + 1;
                break;
            } else {
                //не нашел
            }
            i = i + 1;
        }
        if (count == 0) {
            System.out.println("Символ " + first + " отсутствует");
        }
        while (y < data.length) {
            if (data[y].equals(second)) {
                System.out.println("Символ " + second + " найден");
                count_ = count_ + 1;
                break;
            } else {
                //не нашел
            }
            y = y + 1;
        }
        if (count_ == 0) {
            System.out.println("Символ " + second + " отсутствует");
        }
    }


    public static void task1292(String x) {
        String[] data = new String[]{"a", "b", "c", "d", "e", "f", "g", "h"};
        int i = 0;
        System.out.print(data[0]);
        while (i < data.length) {
            if (data[i].equals(x)) {
                break;
            }
            i = i + 1;
            System.out.print(data[i]);
        }
    }

    public static double task7237(double temperatureC) {
        double temperatureF = (temperatureC * 1.8) + 32;
        return temperatureF;
    }

    public static int task3072(int x, int y, int z) {

        if (x > y & x > z) {
            return x;
        } else {
            if (y > x & y > z) {
                return y;
            } else {
                return z;
            }
        }
    }

    public static int task7035(int[] data) {
        int i = 0;
        int min = data[0];
        System.out.println("Ход решения:");
        System.out.println("Начинаю и запоминаю " + data[0]);

        while (i + 1 <= data.length) {
            System.out.println("Сравниваю " + min + " и " + data[i]);
            if (min > data[i]) {
                System.out.println("Вместо " + min + " запоминаю " + data[i]);
                min = data[i];
            } else {
            }
            i = i + 1;

        }
        System.out.print("В массиве {");
        Library.task_7035(data);
        System.out.println("} минимальный элемент это " + min);
        return min;
    }

    public static int task2173(int[] data) {
        int i = 0;
        int a = 0;
        while (i + 1 < data.length) {
            if (data[i] > data[i + 1]) {
                a = i + 1;
                break;
            } else {
            }
            i = i + 1;
        }
        if (a == 0) {
            System.out.println("Значения отсортированы по возрастанию");
        } else {
            System.out.println("Элемент со значением " + data[a] + " на индексе " + a + " нарушает закономерность");
        }
        return a;
    }

    public static void task_7035(int[] data) {
        int i = 0;
        while (i + 1 <= data.length) {
            System.out.print(data[i] + ";");
            i = i + 1;
        }

    }

    public static void task8769(int[] data, int P, int Q) {
        int i = 0;
        System.out.print("Фрагмент массива:");
        if (P < Q) {
            i = P;

            while (i < Q) {
                System.out.print(data[i] + ", ");
                i = i + 1;
            }
            System.out.print(data[Q] + ", ");
            System.out.print("Минимальный элемент среди них: ");
            int result = min(data, P, Q);
            System.out.print(result);
        } else {
            i = Q;

            while (i < P) {
                System.out.print(data[i] + ", ");
                i = i + 1;
            }
            System.out.print(data[P] + ", ");
            System.out.print("Минимальный элемент среди них: ");
            int result = min(data, Q, P);
            System.out.print(result);
        }
    }

    public static int min(int[] data, int P, int Q) {
        int i = P;
        int min = data[P];
        while (i <= Q) {
            if (min > data[i]) {
                min = data[i];
            } else {

            }

            i = i + 1;
        }
        return min;
    }

//    public static int task_8769(int[] data, int P, int Q) {
//        int i=0;
//        System.out.print("Фрагмент массива:");
//        if (P < Q) {
//            i = P;
//
//            while (i < Q) {
//                System.out.print(data[i] + ", ");
//                i = i + 1;
//            }
//            System.out.print(data[Q] + ", ");
//            System.out.print("Минимальный элемент среди них: ");
//            i = P;
//            int min = data[P];
//            while (i<= Q) {
//                if (min > data[i]) {
//                    min = data[i];
//                } else {
//
//                }
//
//                i = i + 1;
//            } return min;
//            }
//        else {
//            i = Q;
//
//            while (i < P) {
//                System.out.print(data[i] + ", ");
//                i = i + 1;
//            }
//            System.out.print(data[P] + ", ");
//            System.out.print("Минимальный элемент среди них: ");
//            i = Q;
//            int min = data[P];
//            while (i<= P) {
//                if (min > data[i]) {
//                    min = data[i];
//                } else {
//
//                }
//
//                i = i + 1;
//            }
//            return min;
//        }


    public static int task_8769(int[] data, int P, int Q) {
        int i = 0;
        System.out.print("Фрагмент массива:");
        if (P < Q) {
            i = P;

            while (i < Q) {
                System.out.print(data[i] + ", ");
                i = i + 1;
            }
            System.out.print(data[Q] + ", ");
            System.out.print("Минимальный элемент среди них: ");
            int result = min(data, P, Q);
            return result;

        } else {
            i = Q;

            while (i < P) {
                System.out.print(data[i] + ", ");
                i = i + 1;
            }
            System.out.print(data[P] + ", ");
            System.out.print("Минимальный элемент среди них: ");

            int result = min(data, Q, P);
            return result;
        }
    }


    public static int sum(int[] data) {
        int result = sum3(data, 0, data.length);

        return result;
    }

    public static void sum4(int[] data) {
        //как sum, но не возвращает значения
        int result = sum3(data, 0, data.length);
        System.out.println(result);
    }

    public static int sum1(int[] data, int X) {
        int result = sum3(data, X, data.length);
        return result;
    }

    public static int sum2(int[] data, int X) {
        int result = sum3(data, 0, 4);
        return result;
    }

    public static int sum3(int[] data, int X, int Y) {
        int i = X;
        int sum = 0;
        while (i < Y) {
            sum = sum + data[i];

            i = i + 1;
        }
        return sum;
    }
    public static Point task_4913(Point cord, double distance, double angleDeg) {
        double dX = dX(distance, angleDeg);
        double dY = dY(distance, angleDeg);
        double bx = gettcoord(cord.x, dX);
        double by = gettcoord(cord.y, dY);
        Point gett=new Point();
        gett.x=bx;
        gett.y=by;
        System.out.println("Приращение координат: Δx " + dX + " Δy " + dY);
        System.out.println("Координаты второй точки " + "(" + bx + ";" + by + ")");
        return gett;
    }




    public static void task4913(double ax, double ay, double distance, double angleDeg) {
        double dX = dX(distance, angleDeg);
        double dY = dY(distance, angleDeg);
        double bx = gettcoord(ax, dX);
        double by = gettcoord(ay, dY);
        System.out.println("Приращение координат: Δx " + dX + " Δy " + dY);
        System.out.println("Координаты второй точки " + "(" + bx + ";" + by + ")");
    }

    public static double angleRad(double angleDeg) {
        double angleRad = angleDeg * (Math.PI / 180);
        return angleRad;
    }

    public static double dX(double distance, double angleDeg) {
        double Rad = angleRad(angleDeg);
        double dX = distance * Math.cos(Rad);
        return dX;
    }

    public static double dY(double distance, double angleDeg) {
        double Rad = angleRad(angleDeg);
        double dY = distance * Math.sin(Rad);
        return dY;
    }

    public static double gettcoord(double ax, double dX) {
        double bx = ax + dX;
        return bx;
    }

    public static void task1058(double Ax, double Ay, double Bx, double By) {

        double distance = distance(Ax, Ay, Bx, By);

        System.out.println("Координаты точки A ( " + Ax + ";" + Ay + ")");
        System.out.println("Координаты точки B ( " + Bx + ";" + By + ")");
        System.out.println("Расстояние между точками равно " + distance);
    }

    public static double distance(double Ax, double Ay, double Bx, double By) {
        double distance = Math.sqrt((Math.pow((Bx - Ax), 2)) + (Math.pow((By - Ay), 2)));
        return distance;
    }

    public static void data(int day,int month,int year, int a){
        if ((month==2&day<14||a<=14)||(month==2&day<=14||a<14)){
        day=day+a;
        System.out.println(day+"."+month+"."+year);
            } else {
            if ((month==2&day>=14)||(month==2&a>=14)){
            month=month+1;
            day=1;
                System.out.println(day+"."+month+"."+year);}
        }
        if ((month==1||month==3||month==5||month==7||month==8||month==10||month==12)&day<=15||a<=15){
            day=day+a;
            System.out.println(day+"."+month+"."+year);
        } else {
            if((month==1||month==3||month==5||month==7||month==8||month==10||month==12)&day>=15||a>=15){
                month=month+1;
                day=1;
                System.out.println(day+"."+month+"."+year);
            }
        }
        if ((month==2||month==4||month==6||month==9||month==11)&day<=15||a<=15){
            day=day+a;
            System.out.println(day+"."+month+"."+year);
        } else {
            if((month==2||month==4||month==6||month==9||month==11)&day>=15||a>=15){
                month=month+1;
                day=1;
                System.out.println(day+"."+month+"."+year);
            }
        }


    }





}











