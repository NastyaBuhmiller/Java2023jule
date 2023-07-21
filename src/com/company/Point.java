package com.company;

public class Point {
    public double x;
    public double y;

    public static double distanceBetween(Point a,Point b){
        double distance=Math.sqrt((Math.pow((b.x - a.x), 2)) + (Math.pow((b.y - a.y), 2)));
        return distance;
    }

    public static void cord(Point a){
        System.out.println("Координаты точки ("+a.x+","+a.y+")");

    }
}
