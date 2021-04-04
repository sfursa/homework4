package com.company;

public class Rectangle {
    double x;
    double y;

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double calculateArea() {
        double calculateArea = x * y;
        return calculateArea;
    }

    void printArea() {                                                                  // почему void?
        System.out.println("Площадь прямоугольника равна " + calculateArea());
    }

    void printRectangleKind() {
        if (x == y) {
            System.out.println("Это квадрат");
        } else {
            System.out.println("Это прямоугольник");
        }
    }

    boolean isTheSameRectangle(Rectangle rectangle) {
        System.out.println("Прямоугольники равны?");
        return this.x == (rectangle.x) && this.y == (rectangle.y);
    }
}
