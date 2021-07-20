package com.bridgelabz.programs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@FunctionalInterface
interface User{
    void emailValidate();
}


public class UserRegEmail {
    public static void main(String[] args ){                  //main method
         
        User user = () -> {                                   //Lambda -> operator 
            Scanner sc = new Scanner(System.in);
            
            String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";           //Regex Pattern
            
            System.out.println("Enter your Email");
            String email = sc.next();

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            if(matcher.matches()){
                System.out.println("Given email is valid");
            }else{
                System.out.println("Given email is not valid");
            }
        };
        user.emailValidate();

    }
}