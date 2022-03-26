package com.syntax.GroupExercise;

public class Task4Tester {
    public static void main(String[] args) {
        Registration userReg1=new Registration();
        userReg1.setEmail("");
        userReg1.setUserName("");
        userReg1.setPassword("");

        Registration userReg2=new Registration();
        userReg2.setEmail("test@gamil.com");
        userReg2.setUserName("user123");
        userReg2.setPassword("user123");

        Registration userReg3=new Registration();
        userReg3.setEmail("tester@yahoo.com");
        userReg3.setUserName("Tester");
        userReg3.setPassword("tester123");
    }
}
