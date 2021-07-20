package com.bridgelabz.programs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface LastName {
	void LastNameValidate();
}

public class UserRegLastName {                        //class created
	
	public static void main(String[] args) {             //main method
		
		LastName LName = () -> {                      // Lambda -> operator
			Scanner sc = new Scanner(System.in);
		
			String regex = "^[A-Z]{1}[a-z]{3,15}$";         // Regex pattern
			
			System.out.println("Enter your  Last name");
			String name = sc.next();

			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(name);
			if (matcher.matches()) {
				System.out.println("Entered name is valid");
			} else {
				System.out.println("Entered name is not valid");
			}
		};
		LName.LastNameValidate();

	}
}