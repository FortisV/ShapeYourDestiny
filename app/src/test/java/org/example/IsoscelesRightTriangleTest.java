package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsoscelesRightTriangleTest {
    final static double TEST_WIDTH = 10;
    IsoscelesRightTriangle isoscelesRightTriangle;
    @BeforeEach
    void createIsoscelesRightTriangle() {
        isoscelesRightTriangle = new IsoscelesRightTriangle(TEST_WIDTH);
    }
    @Test
    void testArea() {
        assertEquals(0.5 * TEST_WIDTH * TEST_WIDTH, isoscelesRightTriangle.getArea(), 1e-4);
    }
    @Test
    void testPerimeter() {
        assertEquals(TEST_WIDTH * (2 + Math.sqrt(2)), isoscelesRightTriangle.getPerimeter(), 1e-4);
    }
    @Test
    void testNumSides() {
        assertEquals(3, isoscelesRightTriangle.numberOfSides());
    }
}
