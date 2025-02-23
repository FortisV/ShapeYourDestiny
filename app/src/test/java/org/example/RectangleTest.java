package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    final static double TEST_WIDTH = 10;
    final static double TEST_HEIGHT = 5;
    Rectangle rectangle;
    @BeforeEach
    void createRectangle() {
        rectangle = new Rectangle(TEST_WIDTH, TEST_HEIGHT);
    }
    @Test
    void testArea() {
        assertEquals(TEST_WIDTH * TEST_HEIGHT, rectangle.getArea(), 1e-4);
    }
    @Test
    void testPerimeter() {
        assertEquals(2 * (TEST_WIDTH + TEST_HEIGHT), rectangle.getPerimeter(), 1e-4);
    }
    @Test
    void testNumSides() {
        assertEquals(4, rectangle.numberOfSides());
    }
}
