package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RightTriangleTest {
    final static double TEST_WIDTH = 10;
    final static double TEST_HEIGHT = 5;
    RightTriangle rightTriangle;
    @BeforeEach
    void createRightTriangle() {
        rightTriangle = new RightTriangle(TEST_WIDTH, TEST_HEIGHT);
    }
    @Test
    void testArea() {
        assertEquals(0.5 * TEST_WIDTH * TEST_HEIGHT, rightTriangle.getArea(), 1e-4);
    }
    @Test
    void testPerimeter() {
        assertEquals(TEST_WIDTH + TEST_HEIGHT + Math.sqrt(TEST_WIDTH * TEST_WIDTH + TEST_HEIGHT * TEST_HEIGHT), rightTriangle.getPerimeter(), 1e-4);
    }
    @Test
    void testNumSides() {
        assertEquals(3, rightTriangle.numberOfSides());
    }
}
