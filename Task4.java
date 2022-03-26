package com.syntax.GroupExercise;

public class Task4 {
    /* Create Registration Class in which you would have variables as email,
    userName and password that have an access scope only within its own class.
    After creating an object of the class user should be able to call methods
    and in each method separately pass values to set users email, username and password.
Requirements:
 A.	Valid email consider to be only yahoo
 B.	Valid userName and password cannot be empty and should be of length larger than 6 characters. Also valid password cannot contain userName.

     */
}
class Registration {
    private String email;
    private String userName;
    private String password;


    void setEmail(String email) {
        if (email.endsWith("@yahoo.com")) {
            this.email = email;
            System.out.println(email + " is valid");
        } else {
            System.out.println("Invalid email. Please use email in Yahoo.com");
        }
    }

    void setUserName(String userName) {
        this.userName = userName;
        if (userName.isEmpty() || userName.length() < 6) {
            System.out.println("Username can't be empty and should be 6 characters or more");
        } else {
            System.out.println("Username is set successfully");
        }
    }

    void setPassword(String password) {
        this.password = password;
        if (password.isEmpty() || password.length() < 6) {
            System.out.println("Password can't be empty and should be 6 characters or more");
        } else if (password.contains(userName)) {
            System.out.println("Password can't contain username");
        } else {
            System.out.println("Password is set successfully");
        }
    }
}
    //if you need to set user and password in one method, use the following code
   /* void setUserNameAndPassword(String userName, String password){
        this.userName=userName;
        this.password=password;
        if (userName.isEmpty() || password.isEmpty()){
            System.out.println("Username or password can't be empty");
        }else if(userName.length()<6 || password.length()<6){
            System.out.println("Username or password is too short. Should be 6 characters or more");
        }else if (password.contains(userName)){
            System.out.println("Password can't contain username");
        }else{
            System.out.println("Username and password set successfully");
        }
    }*/


