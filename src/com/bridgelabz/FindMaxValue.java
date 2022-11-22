package com.bridgelabz;

public class FindMaxValue {

    /* create maxOfInteger method and passing argumants */

    public static void maxOfFloat(float a, Float b, Float c) {

        Float max = a;
        if (b.compareTo(a) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;

        }
        System.out.println("Maximum Float is: " + max);
    }

    public static void main(String[] args) {

        System.out.println("Welcome To Find Maximum value program using generics \n");
        Float a = 1.2f,b = 4.1f,c=3.6f;
        maxOfFloat(a,b,c);//method calling
    }
}

