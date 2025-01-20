package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void perimeter() throws Exception{
        Rectangle rectangle = new Rectangle(1,2);

        assertEquals(6, rectangle.Perimeter());
    }

    @Test
    void area() throws Exception {
        Rectangle rectangle = new Rectangle(1,2);

        assertEquals(2, rectangle.Area());
    }

    @ParameterizedTest
    @ValueSource(doubles = {-1,-2, 0})
    void exception(double value) {
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            Rectangle rectangle = new Rectangle(value, 2);
        });
        Assertions.assertEquals("Сторона прямоугольника не может быть меньше или равна нулю", exception.getMessage());

        exception = Assertions.assertThrows(Exception.class, () -> {
            Rectangle rectangle = new Rectangle(2, value);
        });
        Assertions.assertEquals("Сторона прямоугольника не может быть меньше или равна нулю", exception.getMessage());

        exception = Assertions.assertThrows(Exception.class, () -> {
            Rectangle rectangle = new Rectangle(2, value);
        });
        Assertions.assertEquals("Сторона прямоугольника не может быть меньше или равна нулю", exception.getMessage());
    }
}