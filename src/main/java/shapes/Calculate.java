package shapes;

public class Calculate {
    public static final double pi = 3.14;

    public static double area(int diameter) {
        return pi * Math.pow((diameter / 2d), 2);
    }

    public static double area(int a, int b, int c) {
        double p = (a + b + c) / 2d;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
