package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
class CircleTest {

    @ParameterizedTest
    @ValueSource(doubles = {1, 0.5})
    void creation(double value) throws Exception{
        Circle circle = new Circle(value);

        assertNotNull(circle);
    }

    @Test
    void perimeter() throws Exception {
        Circle circle = new Circle(1);

        assertEquals(2*Math.PI, circle.Perimeter());
    }

    @Test
    void area() throws Exception {
        Circle circle = new Circle(1);

        assertEquals(Math.PI, circle.Area());
    }

    @ParameterizedTest
    @ValueSource(doubles = {-1, 0})
    void exception(double value) {
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            Circle circle = new Circle(value);
        });
        Assertions.assertEquals("Радиус не может быть меньше или равен нулю", exception.getMessage());

        exception = Assertions.assertThrows(Exception.class, () -> {
            Circle circle = new Circle(value);
        });
        Assertions.assertEquals("Радиус не может быть меньше или равен нулю", exception.getMessage());
    }
}
