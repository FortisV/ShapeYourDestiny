package org.example;

public class IsoscelesRightTriangle extends RightTriangle {
    IsoscelesRightTriangle() {
        super(RightTriangle.DEFAULT_WIDTH, RightTriangle.DEFAULT_WIDTH);
    }
    IsoscelesRightTriangle(double side) {
        super(side, side);
    }
}
