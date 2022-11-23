package com.bridgelabz;

public class FindMaxValue<T extends Comparable<T>> {

    T a,b,c;

    public FindMaxValue(T a,T b,T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /* create maxOfString method and passing argumants */

    public static <T extends Comparable<T>> T maxOfValue(T a,T b,T c ) {

        T max = a;

        if (b.compareTo(a) > 0)

            max = b;

        if (c.compareTo(max) > 0)
            max = c;
            return max;
        }

    public static void main(String[] args) {

        System.out.println("Welcome To Find Maximum value program using generics \n");
        System.out.println("The maximum value between three Integer is: " + maxOfValue(12,11,13));
        System.out.println("The maximum value between three Float is: " + maxOfValue(1.2f,1.1f,1.3f));
        System.out.println("The maximum value between three String is: " + maxOfValue("Apple","Peach","Banana"));

    }
}

