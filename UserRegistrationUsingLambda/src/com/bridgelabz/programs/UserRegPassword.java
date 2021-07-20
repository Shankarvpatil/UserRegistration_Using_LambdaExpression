package com.bridgelabz.programs;

import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface Password {
    void passWordValidate();                      //Method to check validation
}

public class UserRegPassword{
	
    public static void main(String[] args ){
      
        Password password = () -> {                       //Lambda -> operator
            Scanner sc = new Scanner(System.in);

            String regex = "^[A-Z]{1}+[a-zA-z1-9]{5,}[@$^]{1}[1-9]{1}$";;

            System.out.println("Enter your Password");
            String pass = sc.next();

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(pass);
            if(matcher.matches()){
                System.out.println("Password is valid");
            }else{
                System.out.println("Password is not valid");
            }
        };
      password.passWordValidate();

    }
}