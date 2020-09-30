package com.cagpi.userregistrationg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationGradle {

	public boolean ValidateFirstName(String fName) throws UserRegistrationCustomException {
		Pattern pattern = Pattern.compile("([A-Z]{1})([a-zA-Z]{2,})");
		Matcher matcher = pattern.matcher(fName);
		boolean isValid = matcher.find();
		if (isValid) {
			System.out.println("Name is valid");

		} else {
			throw new UserRegistrationCustomException("Name is invalid");

		}
		return (isValid);
	}

	public boolean ValidateLastName(String lName) throws UserRegistrationCustomException {
		Pattern pattern = Pattern.compile("([A-Z]{1})([a-zA-Z]{2,})");
		Matcher matcher = pattern.matcher(lName);
		boolean isValid = matcher.find();
		if (isValid) {
			System.out.println(" Last Name is valid");

		} else {
			throw new UserRegistrationCustomException("Last Name is invalid");

		}
		return (isValid);
	}

	public boolean ValidateEmail(String email) throws UserRegistrationCustomException {
		Pattern pattern = Pattern
				.compile("(^([a-z0-9+_-]+)([.][0-9a-z]+)*@([a-z0-9]+)([.]([a-z]{2,}))([.][a-z]{2})?$)");
		Matcher matcher = pattern.matcher(email);
		boolean isValid = matcher.find();
		if (isValid) {
			System.out.println("email is valid");

		} else {
			throw new UserRegistrationCustomException("email is invalid");

		}
		return (isValid);
	}

	public boolean ValidatePhoneNo(String phoneNo) throws UserRegistrationCustomException {
		Pattern pattern = Pattern.compile("(^([0-9]+)( )([1-9]{1})([0-9]{9})$)");
		Matcher matcher = pattern.matcher(phoneNo);
		boolean isValid = matcher.find();
		if (isValid) {
			System.out.println("phoneNO is valid");

		} else {
			throw new UserRegistrationCustomException("phoneNo is invalid");

		}
		return (isValid);
	}

	public boolean ValidatePassword(String password) throws UserRegistrationCustomException {
		Pattern pattern = Pattern.compile("(?=.*[A-Z])(?=.*[0-9])(?=.*\\W)(?!.*\\W\\w*\\W)(?!.*\\s).{8,}$");
		Matcher matcher = pattern.matcher(password);
		boolean isValid = matcher.find();
		if (isValid) {
			System.out.println("password is valid");

		} else {
			throw new UserRegistrationCustomException("password is invalid");

		}
		return (isValid);
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
		try {
			userObj.ValidatePassword(password);
		} catch (UserRegistrationCustomException e) {
			System.out.println(e.getMessage());
		}
	}
}