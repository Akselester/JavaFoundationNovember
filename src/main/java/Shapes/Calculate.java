package Shapes;

public class Calculate {
    public static double pi = 3.14;

    public static double area(int diameter) {
        return pi * ((diameter / 2d) * (diameter / 2d));
    }

    public static double area(int a, int b, int c) {
        double p = (a + b + c) / 2d;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
