package com.company;

public class Rectangle {
    double x;
    double y;
    private static int createdRectangles;
    public static final String RUSSIAN_CLASS_NAME = "Прямоугольник";
    public static final String ENGLISH_CLASS_NAME = "Rectangle";


    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
        createdRectangles++;
    }

    public Rectangle(double x) {
        this.x = x;
        y = x;
        createdRectangles++;
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
        return this.x == rectangle.x && this.y == rectangle.y;
    }
    public static void printRectanglesCount(){
        System.out.println("Всего было создано " + createdRectangles + " прямоугольников");
    }
    public static void printClassNmae(boolean printlnRussian){
        if (printlnRussian){
            System.out.println(RUSSIAN_CLASS_NAME);
        }else{
            System.out.println(ENGLISH_CLASS_NAME);
        }
    }
}
