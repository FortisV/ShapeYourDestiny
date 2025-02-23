package org.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Circle");
        double circleRadius = 13;
        System.out.println("radius = " + circleRadius);
        Circle circle = new Circle(circleRadius);
        System.out.println("area = " + circle.getArea());
        System.out.println("perimeter = " + circle.getPerimeter());
        System.out.println();

        System.out.println("Rectangle");
        double rectangleWidth = 32;
        double rectangleHeight = 17;
        System.out.println("width = " + rectangleWidth);
        System.out.println("height = " + rectangleHeight);
        Rectangle rectangle = new Rectangle(rectangleWidth, rectangleHeight);
        System.out.println("area = " + rectangle.getArea());
        System.out.println("perimeter = " + rectangle.getPerimeter());
        System.out.println("number of sides = " + rectangle.numberOfSides());
        System.out.println();

        System.out.println("Square");
        double squareWidth = 11;
        System.out.println("width = " + squareWidth);
        Square square = new Square(squareWidth);
        System.out.println("area = " + square.getArea());
        System.out.println("perimeter = " + square.getPerimeter());
        System.out.println("number of sides = " + square.numberOfSides());
        System.out.println();

        System.out.println("RightTriangle");
        double rightTriangleWidth = 23;
        double rightTriangleHeight = 47;
        System.out.println("width = " + rightTriangleWidth);
        System.out.println("height = " + rightTriangleHeight);
        RightTriangle rightTriangle = new RightTriangle(rightTriangleWidth, rightTriangleHeight);
        System.out.println("area = " + rightTriangle.getArea());
        System.out.println("perimeter = " + rightTriangle.getPerimeter());
        System.out.println("number of sides = " + rightTriangle.numberOfSides());
        System.out.println();

        System.out.println("IsoscelesRightTriangle");
        double isoscelesRightTriangleWidth = 7;
        System.out.println("width = " + isoscelesRightTriangleWidth);
        IsoscelesRightTriangle isoscelesRightTriangle = new IsoscelesRightTriangle(isoscelesRightTriangleWidth);
        System.out.println("area = " + isoscelesRightTriangle.getArea());
        System.out.println("perimeter = " + isoscelesRightTriangle.getPerimeter());
        System.out.println("number of sides = " + isoscelesRightTriangle.numberOfSides());
    }
}
