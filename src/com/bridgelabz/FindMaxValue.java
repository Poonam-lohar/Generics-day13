package com.bridgelabz;

public class FindMaxValue {

    /* create maxOfString method and passing argumants */

    public static void maxOfString(String a,String b,String c) {
        String max = a;
        if (b.compareTo(a) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;

        }
        System.out.println("Maximum String is: " + max);
    }

    public static void main(String[] args) {

        System.out.println("Welcome To Find Maximum value program using generics \n");
        String a = "Apple",b = "Peach",c="Banana";
        maxOfString(a,b,c);//method calling
    }
}

