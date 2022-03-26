package com.syntax.GroupExercise;

public class Task2 {
    /* We have to calculate the average of marks obtained in three subjects by student A and by student B.
       Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks.
       Provide implementation of abstract method in classes 'A' and 'B'.
       The constructor of student A takes the marks in three subjects as its parameters
       and the marks in four subjects as its parameters for student B.
       Test your code
     */
}

abstract class Marks{
    int math, science, economics, business;

    abstract void getPercentage();
}

 class A extends Marks{
     public A(int math, int economic, int business) {
         this.math=math;
         this.economics=economic;
         this.business=business;
     }

     @Override
     void getPercentage() {
         System.out.println((math+economics+business)/3);
     }
 }

class B extends Marks{
    public B(int math, int economic, int business, int science) {
        this.math=math;
        this.economics=economic;
        this.business=business;
        this.science=science;
    }

    @Override
    void getPercentage() {
        System.out.println((math+economics+business+science)/4);
    }
}
