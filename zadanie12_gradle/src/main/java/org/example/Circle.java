package org.example;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius) throws Exception {
        if (radius <= 0) {
            throw new Exception("Радиус не может быть меньше или равен нулю");
        }

        this.radius = radius;
    }

    @Override
    public double Perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double Area() {
        return Math.PI * radius * radius;
    }
}
