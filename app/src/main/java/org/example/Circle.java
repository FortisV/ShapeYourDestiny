package org.example;

public class Circle extends Shape {
    protected static final double DEFAULT_RADIUS = 0;
    protected  double radius;
    Circle() {
        this.radius = DEFAULT_RADIUS;
    }
    Circle(double radius) {
        this.radius = radius;
    }
    void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
