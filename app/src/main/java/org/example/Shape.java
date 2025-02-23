package org.example;

public abstract class Shape {
    protected static final double DEFAULT_AREA = 0;
    protected static final double DEFAULT_PERIMETER = 0;
    double getArea() {
        return DEFAULT_AREA;
    }
    double getPerimeter() {
        return DEFAULT_PERIMETER;
    }
}
