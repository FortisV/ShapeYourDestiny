package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    final static double TEST_RADIUS = 10;
    Circle circle;
    @BeforeEach
    void createCircle() {
        circle = new Circle(TEST_RADIUS);
    }
    @Test
    void testArea() {
        assertEquals(Math.PI * TEST_RADIUS * TEST_RADIUS, circle.getArea(), 1e-4);
    }
    @Test
    void testPerimeter() {
        assertEquals(2 * Math.PI * TEST_RADIUS, circle.getPerimeter(), 1e-4);
    }
}
