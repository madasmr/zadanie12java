package org.example.cucumber.steps;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.example.Circle;
import org.example.Square;

import static org.junit.Assert.assertEquals;

public class SquareSteps {
    private double side;
    private Square square;
    private Exception exception;

    @Когда("Мы создаем квадрат")
    public void createTheSquare() {
        try {
            square = new Square(side);
        } catch (Exception e) {
            exception = e;
        }
    }

    @Тогда("Мы получаем {double} периметр квадрата")
    public void getPerimeterOfTheSquare(double expectedPerimeter) {
        assertEquals(expectedPerimeter, square.Perimeter(), 0.01);
    }

    @И("Мы получаем {double} площадь квадрата")
    public void getAreaOfTheSquare (double expectedArea) {
        assertEquals(expectedArea, square.Area(), 0.01);
    }

    @Тогда("Появляется {string} для квадрата")
    public void exceptionIsThrownSquare(String expectedException) {
        assertEquals(expectedException, exception.getMessage());
    }

    @Дано("У нас есть {double} квадрата")
    public void setParameterizedSide(double side) {
        this.side = side;
    }
}
