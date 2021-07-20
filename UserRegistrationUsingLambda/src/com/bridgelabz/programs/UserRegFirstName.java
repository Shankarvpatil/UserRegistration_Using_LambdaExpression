package com.bridgelabz.programs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@FunctionalInterface
interface FirstName {                              //interface
  void firstNameValidate();
}

public class UserRegFirstName {                         //class created

  public static void main(String[] args ){            //main method
      
      FirstName fName = () -> {                    //Lambda -> operator uses for first name
          Scanner sc = new Scanner(System.in);
         
          String regex = "^[A-Z]{1}[a-z]{3,20}$";        //regex pattern
         
          System.out.println("Enter your name");
          String name = sc.next();

          Pattern pattern = Pattern.compile(regex);
          Matcher matcher = pattern.matcher(name);
          if(matcher.matches()){
              System.out.println("Enter name is valid");
          }else{
              System.out.println("Enter name is not valid");
          }
      };
      fName.firstNameValidate();

  }
}