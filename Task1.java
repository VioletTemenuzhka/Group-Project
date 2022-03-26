package com.syntax.GroupExercise;

public class Task1 {
    /*1.	Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
            Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
            Test your code.
     */
}
interface Shape{
    void calculateArea();
    void calculatePerimeter();
}

class Circle implements Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println(Math.PI*Math.pow(radius,2));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println((2*Math.PI*radius));
    }
}

class Square implements Shape{
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        System.out.println(side*side);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println(side*4);
    }
}