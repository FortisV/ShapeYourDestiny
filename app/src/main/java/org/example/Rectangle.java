package org.example;

public class Rectangle extends Shape implements Polygon {
    protected static final double DEFAULT_WIDTH = 0;
    protected static final double DEFAULT_HEIGHT = 0;
    protected static final int RECTANGLE_SIDES = 4;
    protected double width;
    protected double height;
    Rectangle() {
        this.width = DEFAULT_WIDTH;
        this.height = DEFAULT_HEIGHT;
    }
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }
    @Override
    double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public int numberOfSides() {
        return RECTANGLE_SIDES;
    }
}
