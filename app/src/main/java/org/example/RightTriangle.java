package org.example;

public class RightTriangle extends Shape implements Polygon {
    protected static final double DEFAULT_WIDTH = 0;
    protected static final double DEFAULT_HEIGHT = 0;
    protected static final int RIGHT_TRIANGLE_SIDES = 3;
    protected double width;
    protected double height;
    RightTriangle() {
        this.width = DEFAULT_WIDTH;
        this.height = DEFAULT_HEIGHT;
    }
    RightTriangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getHypotenuse() {
        return Math.sqrt(width * width + height * height);
    }

    @Override
    double getArea() {
        return width * height / 2;
    }
    @Override
    double getPerimeter() {
        return width + height + getHypotenuse();
    }

    @Override
    public int numberOfSides() {
        return RIGHT_TRIANGLE_SIDES;
    }
}
