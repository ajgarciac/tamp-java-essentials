package com.java_essentials.introduction_to_java;

import java.util.Random;

public class DataTypesAndOperations {

    public static void main(String[] args) {
        Random rn = new Random();
        int n = rn.nextInt(1000);
        System.out.printf("Initial value is %d%n", n);
        int x = rn.nextInt(1000);
        n = add(n, x);
        System.out.printf("Adding %d will give us %d%n", x, n);
        x = rn.nextInt(1000);
        n = substract(n, x);
        System.out.printf("Substracting %d will give us %d%n", x, n);
        x = rn.nextInt(1000);
        n = multiplicate(n, x);
        System.out.printf("Multiplicating for %d will give us %d%n", x, n);
        x = rn.nextInt(1000);
        n = divide(n, x);
        System.out.printf("Dividing for %d will give us %d%n", x, n);
        x = rn.nextInt(1000);
        int i = x;
        while (x > 0){
            n++;
            x--;
        }
        System.out.printf("Incrementing %d times will give us %d%n", i, n);
        x = rn.nextInt(1000);
        int d = x;
        while (x > 0){
            n--;
            x--;
        }
        System.out.printf("Decrementing %d times will give us %d%n", d, n);

    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int substract(int a, int b){
        return a - b;
    }

    public static int multiplicate(int a, int b){
        return a * b;
    }

    public static int divide(int a, int b){
        return a / b;
    }

}
