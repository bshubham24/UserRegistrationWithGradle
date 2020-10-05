package com.cagpi.userregistrationg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface iValidation {
	public boolean validation(String s);
}

public class UserRegistrationGradle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pattern patternFirstName = Pattern.compile("([A-Z]{1})([a-zA-Z]{2,})");
		Pattern patternLastName = Pattern.compile("([A-Z]{1})([a-zA-Z]{2,})");
		Pattern patternEmail = Pattern
				.compile("(^([a-z0-9+_-]+)([.][0-9a-z]+)*@([a-z0-9]+)([.]([a-z]{2,}))([.][a-z]{2})?$)");
		Pattern patternPhoneNo = Pattern.compile("(^([0-9]+)( )([1-9]{1})([0-9]{9})$)");
		Pattern patternPassword = Pattern.compile("(?=.*[A-Z])(?=.*[0-9])(?=.*\\W)(?!.*\\W\\w*\\W)(?!.*\\s).{8,}$");

		iValidation firstName = (name) -> {
			Matcher matcher = patternFirstName.matcher(name);
			boolean isValid = matcher.find();
			if (isValid)
				return true;
			else
				return false;
		};
		iValidation lastName = (name) -> {
			Matcher matcher = patternLastName.matcher(name);
			boolean isValid = matcher.find();
			if (isValid)
				return true;
			else
				return false;
		};
		iValidation email = (name) -> {
			Matcher matcher = patternEmail.matcher(name);
			boolean isValid = matcher.find();
			if (isValid)
				return true;
			else
				return false;
		};
		iValidation phoneNo = (name) -> {
			Matcher matcher = patternPhoneNo.matcher(name);
			boolean isValid = matcher.find();
			if (isValid)
				return true;
			else
				return false;
		};
		iValidation password = (name) -> {
			Matcher matcher = patternPassword.matcher(name);
			boolean isValid = matcher.find();
			if (isValid)
				return true;
			else
				return false;
		};
		boolean check = false;
		while (!check) {
			System.out.println("Enter First Name");
			String fName = sc.nextLine();
			if (firstName.validation(fName)) {
				System.out.println("Valid Firstname");
			} else
				System.out.println("Invalid Firstname");
			System.out.println("Enter Last Name");
			String lName = sc.nextLine();
			if (lastName.validation(lName)) {
				System.out.println("Valid Lastname");
			} else
				System.out.println("Invalid Lastname");
			System.out.println("Enter Email");
			String mail = sc.nextLine();
			if (email.validation(mail)) {
				System.out.println("Valid Email");
			} else
				System.out.println("Invalid Email");
			System.out.println("Enter Phone number");
			String phone = sc.nextLine();
			if (phoneNo.validation(phone)) {
				System.out.println("Valid Phone number");
			} else
				System.out.println("Invalid Phone number");
			System.out.println("Enter Password");
			String passWord = sc.nextLine();
			if (password.validation(passWord)) {
				System.out.println("Valid Password");
				check = true;
			} else
				System.out.println("Invalid Password");
		}
	}
}
