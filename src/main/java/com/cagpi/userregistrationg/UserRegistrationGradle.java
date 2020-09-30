package com.cagpi.userregistrationg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationGradle {

	public boolean ValidateFirstName(String fName) {
		Pattern pattern = Pattern.compile("([A-Z]{1})([a-zA-Z]{2,})");
		Matcher matcher = pattern.matcher(fName);
		boolean isValid = matcher.find();
		if (isValid) {
			return true;

		} else {
			return false;

		}
	}

	public boolean ValidateLastName(String lName) {
		Pattern pattern = Pattern.compile("([A-Z]{1})([a-zA-Z]{2,})");
		Matcher matcher = pattern.matcher(lName);
		boolean isValid = matcher.find();
		if (isValid) {
			return true;

		} else {
			return false;

		}
	}

	public boolean ValidateEmail(String email) {
		Pattern pattern = Pattern
				.compile("(^([a-z0-9+_-]+)([.][0-9a-z]+)*@([a-z0-9]+)([.]([a-z]{2,}))([.][a-z]{2})?$)");
		Matcher matcher = pattern.matcher(email);
		boolean isValid = matcher.find();
		if (isValid) {
			return true;
		} else {
			return false;

		}
	}

	public boolean ValidatePhoneNo(String phoneNo) {
		Pattern pattern = Pattern.compile("(^([0-9]+)( )([1-9]{1})([0-9]{9})$)");
		Matcher matcher = pattern.matcher(phoneNo);
		boolean isValid = matcher.find();
		if (isValid) {
			return true;
		} else {
			return false;

		}
	}

	public boolean ValidatePassword(String password) {
		Pattern pattern = Pattern.compile("(?=.*[A-Z])(?=.*[0-9])(?=.*\\W)(?!.*\\W\\w*\\W)(?!.*\\s).{8,}$");
		Matcher matcher = pattern.matcher(password);
		boolean isValid = matcher.find();
		if (isValid) {
			return true;

		} else {
			return false;

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		UserRegistrationGradle userObj = new UserRegistrationGradle();

		/*
		 * System.out.println("Enter the First name"); String fName = sc.nextLine();
		 * userObj.ValidateFirstName(fName);
		 * 
		 * System.out.println("Enter the last name"); String lName = sc.nextLine();
		 * userObj.ValidateLastName(lName);
		 * 
		 * System.out.println("Enter Email"); String email = sc.nextLine();
		 * userObj.ValidateEmail(email);
		 * 
		 * System.out.println("Enter Phone number"); String phoneNo = sc.nextLine();
		 * userObj.ValidatePhoneNo(phoneNo);
		 */
		System.out.println("Enter Password");
		String password = sc.nextLine();
		userObj.ValidatePassword(password);
	}
}
