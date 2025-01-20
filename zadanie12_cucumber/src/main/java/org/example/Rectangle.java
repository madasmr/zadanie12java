package org.example;

public class Rectangle implements Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width) throws Exception{
        if (length <= 0 | width <= 0) {
            throw new Exception("Сторона прямоугольника не может быть меньше или равна нулю");
        }

        this.length = length;
        this.width = width;
    }

    @Override
    public double Perimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public double Area() {
        return length * width;
    }
}
