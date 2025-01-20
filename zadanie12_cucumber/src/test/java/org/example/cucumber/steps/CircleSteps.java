package org.example.cucumber.steps;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.example.Circle;

import static org.junit.Assert.assertEquals;

public class CircleSteps {
    private double radius;
    private Exception exception;
    private Circle circle;

    @Когда("Мы создаем круг")
    public void createTheCircle() {
        try {
            circle = new Circle(radius);
        } catch (Exception e) {
            exception = e;
        }
    }

    @Тогда("Мы получаем {double} периметр круга")
    public void getPerimeterOfTheCircle(double expectedPerimeter) {
        assertEquals(expectedPerimeter, circle.Perimeter(), 0.01);
    }

    @И("Мы получаем {double} площадь круга")
    public void getAreaOfTheCircle(double expectedArea) {
        assertEquals(expectedArea, circle.Area(), 0.01);
    }

    @Дано("У нас есть {double} круга")
    public void setParameterizedRadius(double radius) {
        this.radius = radius;
    }

    @Тогда("Появляется {string} для круга")
    public void exceptionIsThrownCircle (String expectedException) {
        assertEquals(expectedException, exception.getMessage());
    }
}
