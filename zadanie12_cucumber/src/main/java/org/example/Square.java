package org.example;

public class Square implements Shape{
    private double side;

    public Square(double side) throws Exception {
        if (side <= 0) {
            throw new Exception("Сторона квадрата не может быть меньше или равна нулю");
        }

        this.side = side;
    }

    @Override
    public double Perimeter() {
        return 4 * side;
    }

    @Override
    public double Area() {
        return side * side;
    }
}
