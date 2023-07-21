package com.company;

import java.security.PublicKey;

public class Liquid {
    public double volume;
    public double temperature;
    public static Liquid volume(Liquid a,Liquid b){
        double temperature1=(a.temperature*a.volume+b.temperature*b.volume)/(a.volume+b.volume);
        double volume1=a.volume+b.volume;
        Liquid a1=new Liquid();
        a1.volume=volume1;
        a1.temperature=temperature1;
        return a1;

    }
}
