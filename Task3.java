package com.syntax.GroupExercise;

public class Task3 {
    /* Create a Class Car that would have the following fields:
    carPrice and color and method calculateSalePrice() which should be returning a price of the car.
    Create 2 subclasses: Sedan and Truck. The Truck class has field as weight
    and has its own implementation of  calculateSalePrice() method in which returned price calculated as following:
    if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
    The Sedan class has field as length and also does it its own implementation of calculateSalePrice():
    if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
     */
}
class Car{
    private double carPrice;
    private String color;


    public double calculateSalePrice(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
        return carPrice;
    }
}

    class Sedan extends Car {
        double length;
        public double calculateSalePrice(double carPrice, String color,double length) {
            if (length > 20) {
                return carPrice - (carPrice * 0.05);
            } else {
                return carPrice - (carPrice * 0.1);
            }
        }
    }

    class Truck extends Car {
        double weight;
        public double calculateSalePrice(double carPrice, String color,double weight) {
            if (weight > 2000) {
                return carPrice - (carPrice * 0.1);
            } else {
                return carPrice - (carPrice * 0.2);
            }
        }
    }
