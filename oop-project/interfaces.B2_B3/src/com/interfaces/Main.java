package com.interfaces;

public class Main {
    public void drawShape(Shape shape){
        shape.draw();
    }

    public static void main(String[] args) {
        Main main = new Main();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        System.out.println("Wywołanie metod draw:");
        main.drawShape(triangle);
        main.drawShape(rectangle);
        main.drawShape(circle);
    }
}
