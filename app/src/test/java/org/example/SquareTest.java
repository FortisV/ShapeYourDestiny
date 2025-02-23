package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    final static double TEST_WIDTH = 10;
    Square square;
    @BeforeEach
    void createSquare() {
        square = new Square(TEST_WIDTH);
    }
    @Test
    void testArea() {
        assertEquals(TEST_WIDTH * TEST_WIDTH, square.getArea(), 1e-4);
    }
    @Test
    void testPerimeter() {
        assertEquals(4 * TEST_WIDTH, square.getPerimeter(), 1e-4);
    }
    @Test
    void testNumSides() {
        assertEquals(4, square.numberOfSides());
    }
}
