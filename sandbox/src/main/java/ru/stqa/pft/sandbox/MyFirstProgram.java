package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("user");

        double l = 5;
        area(5);
        System.out.println("test " + l + area(l));
    }

    public static void hello(String text) {
        System.out.println("Hello " + text);
    }

    public static double area(double l) {
		return l * l;
    }
    public static double area(double l, double d) {
        return l * d;
    }

}