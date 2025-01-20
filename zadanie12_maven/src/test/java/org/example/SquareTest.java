package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @ParameterizedTest
    @ValueSource(doubles = {1, 0.5})
    void creation(double value) throws Exception{
        Square square = new Square(value);

        assertNotNull(square);
    }

    @Test
    void perimeter() throws Exception {
        Square square = new Square(1);

        assertEquals(4, square.Perimeter());
    }

    @Test
    void area() throws Exception {
        Square square = new Square(1);

        assertEquals(1, square.Area());
    }

    @ParameterizedTest
    @ValueSource(doubles = {-1,0})
    void exception(double value) {
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            Square square = new Square(value);
        });
        Assertions.assertEquals("Сторона квадрата не может быть меньше или равна нулю", exception.getMessage());

        exception = Assertions.assertThrows(Exception.class, () -> {
            Square square = new Square(value);
        });
        Assertions.assertEquals("Сторона квадрата не может быть меньше или равна нулю", exception.getMessage());
    }
}
