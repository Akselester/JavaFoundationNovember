package Shapes;

public abstract class Shape {

    public static void main(String[] args) {
        Shape triangle = new Triangle(12, 10, 8);
        Shape circle = new Circle(15);
        System.out.println(triangle.getArea());
        System.out.println(circle.getArea());
    }

    static final double pi = 3.14;

    public abstract double getArea();
}

class Triangle extends Shape {
    private int sideA;
    private int sideB;
    private int sideC;

    Triangle(int a, int b, int c) {
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }

    @Override
    public double getArea() {
        double p = (sideA + sideB + sideC) / 2d;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }
}

class Circle extends Shape {
    private int diameter;

    Circle(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public double getArea() {
        return pi * ((diameter / 2d) * (diameter / 2d));
    }
}
