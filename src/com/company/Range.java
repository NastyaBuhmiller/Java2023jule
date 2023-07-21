package com.company;

public class Range {
    public int from;
    public int to;

    public static int contains(Range y, double x){

        if (x>y.to&x<y.from){
        System.out.println("Интервал ["+y.to+","+y.from+"] содержит число "+x);

        return 1;
        } else{
            System.out.println("Число "+x+" находится за пределами интервала ["+y.to+","+y.from+"]");
            return 0;
        }
    }
}
