package com.bridgelabz;

public class FindMaxValue {

    /* create maxOfString method and passing argumants */

    public static <T extends Comparable> void maxOfValue(T a,T b,T c ) {

        T max = a;
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

        Integer a=12,b=11,c=13;
        Float p=1.2f,q=1.1f,r=1.3f;
        String s="Apple",t="Peach",u="Banana";

        FindMaxValue.maxOfValue(a,b,c);
        FindMaxValue.maxOfValue(p,q,r);
        FindMaxValue.maxOfValue(s,t,u);
    }
}

