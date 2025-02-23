package org.example;

public class Square extends Rectangle {
    Square() {
        super(Rectangle.DEFAULT_WIDTH, Rectangle.DEFAULT_WIDTH);
    }
    Square(double side) {
        super(side, side);
    }
}
