package com.syntax.GroupExercise;

public class Task3Tester {
    public static void main(String[] args) {
        Sedan sedan=new Sedan();
        System.out.println(sedan.calculateSalePrice(38000,"Red", 6));

        Truck truck=new Truck();
        System.out.println(truck.calculateSalePrice(55000,"Blue", 2500));
    }
}
