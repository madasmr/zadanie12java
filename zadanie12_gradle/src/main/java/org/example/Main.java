package org.example;

import java.io.BufferedReader;
import java.io.FileReader;

interface Shape{
    double Perimeter();
    double Area();
}

public class Main {
    private static String[] values;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("shapes.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            values = line.split(",");
        }

        try {
            double radius = Double.parseDouble(values[0]);
            double side = Double.parseDouble(values[1]);
            double length = Double.parseDouble(values[2]);
            double width = Double.parseDouble(values[3]);

            Circle circle = new Circle(radius);
            Square square = new Square(side);
            Rectangle rectangle = new Rectangle(length, width);

            System.out.println("Круг:");
            System.out.println("Периметр: " + circle.Perimeter() + ", площадь: " + circle.Area());

            System.out.println("Квадрат:");
            System.out.println("Периметр: " + square.Perimeter() + ", площадь: " + square.Area());

            System.out.println("Прямоугольник:");
            System.out.println("Периметр: " + rectangle.Perimeter() + ", площадь: " + rectangle.Area());
        } catch (Exception e) {
            System.out.println("Что-то пошло не так :(");
        } finally{
            br.close();
        }
    }
}