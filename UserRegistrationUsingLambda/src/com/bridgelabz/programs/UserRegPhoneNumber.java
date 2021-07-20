package com.bridgelabz.programs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface Phone{
    void mobileNoValidate();
}

public class UserRegPhoneNumber{                       //class created
	
    public static void main(String[] args ){           //main method
        
       Phone phone = () -> {                           //Lambda -> operator
            Scanner sc = new Scanner(System.in);

            String regex = "^(91){1}[0-9]{10}$";

            System.out.println("Enter your Phone number");
            String mobile = sc.next();

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(mobile);
            if(matcher.matches()){
                System.out.println("Phone number is valid");
            }else{
                System.out.println("Phone number is not valid");
            }
        };
       phone.mobileNoValidate();

    }
}

