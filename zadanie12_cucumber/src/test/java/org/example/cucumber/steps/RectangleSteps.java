package org.example.cucumber.steps;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.example.Rectangle;

import static org.junit.Assert.assertEquals;

public class RectangleSteps {
    private double length;
    private double width;
    private Rectangle rectangle;
    private Exception exception;

    @Дано("У нас есть {double} и {double} прямоугольника")
    public void setParameterizedLengthAndWidth(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Когда("Мы создаем прямоугольник")
    public void createTheRectangle() {
        try {
            rectangle = new Rectangle(length, width);
        } catch (Exception e) {
            exception = e;
        }
    }

    @Тогда("Мы получаем {double} периметр прямоугольника")
    public void getPerimeterOfTheRectangle(double expectedPerimeter) {
        assertEquals(expectedPerimeter, rectangle.Perimeter(), 0.01);
    }

    @И("Мы получаем {double} площадь прямоугольника")
    public void getAreaOfTheRectangle(double expectedArea) {
        assertEquals(expectedArea, rectangle.Area(), 0.01);
    }

    @Тогда("Появляется {string} для прямоугольника")
    public void exceptionIsThrownRectangle(String expectedException) {
        assertEquals(expectedException, exception.getMessage());
    }
}
