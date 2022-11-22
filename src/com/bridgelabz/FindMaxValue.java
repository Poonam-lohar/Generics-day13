package com.bridgelabz;

public class FindMaxValue {

    /* create maxOfInteger method and passing argumants */

    public static void maxOfInteger(Integer a, Integer b, Integer c) {

        Integer max = a;
        if (b.compareTo(a) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;

        }
        System.out.println("Maximum Integer is: " + max);
    }

    public static void main(String[] args) {

        System.out.println("Welcome To Find Maximum value program using generics \n");
        Integer a = 10, b = 20, c = 30;
        maxOfInteger(a,b,c); //method calling
    }
}

