package com.company;

public class Perimetr {
    static double a;
    static double b;
    static double c;

    static void area(){
        double p=(a+b+c)/2;
        System.out.println(Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }
}
