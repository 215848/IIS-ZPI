package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("W drugim branchu; 2-3="+Policz2(2,3));
        System.out.println("W pierwszym branchu; 2+3="+Policz(2,3));
    }

    private static int Policz2(int i, int i1) {
        return i-i1;

    }

    private static int Policz(int i, int i1) {
        return i+i1;

    }
}
