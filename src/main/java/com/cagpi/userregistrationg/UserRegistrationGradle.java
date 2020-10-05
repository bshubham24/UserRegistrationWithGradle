package com.cagpi.userregistrationg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface iValidation {
	public boolean validation(String s);
}

public class UserRegistrationGradle {
	public static boolean Validation(String fName, String lName, String mail, String phone, String passWord)
			throws UserRegistrationCustomException {
		Pattern patternFirstName = Pattern.compile("([A-Z]{1})([a-zA-Z]{2,})");
		Pattern patternLastName = Pattern.compile("([A-Z]{1})([a-zA-Z]{2,})");
		Pattern patternEmail = Pattern
				.compile("(^([a-z0-9+_-]+)([.][0-9a-z]+)*@([a-z0-9]+)([.]([a-z]{2,}))([.][a-z]{2})?$)");
		Pattern patternPhoneNo = Pattern.compile("(^([0-9]+)( )([1-9]{1})([0-9]{9})$)");
		Pattern patternPassword = Pattern.compile("(?=.*[A-Z])(?=.*[0-9])(?=.*\\W)(?!.*\\W\\w*\\W)(?!.*\\s).{8,}$");

		iValidation firstName = (name) -> {
			Matcher matcher = patternFirstName.matcher(fName);
			boolean isValid = matcher.find();
			if (isValid)
				return true;

			else
				return false;
		};

		iValidation lastName = (name) -> {
			Matcher matcher = patternLastName.matcher(lName);
			boolean isValid = matcher.find();
			if (isValid)
				return true;
			else
				return false;
		};

		iValidation email = (name) -> {
			Matcher matcher = patternEmail.matcher(mail);
			boolean isValid = matcher.find();
			if (isValid)
				return true;
			else
				return false;

		};
		iValidation phoneNo = (name) -> {
			Matcher matcher = patternPhoneNo.matcher(phone);
			boolean isValid = matcher.find();
			if (isValid)
				return true;
			else
				return false;

		};
		iValidation password = (name) -> {
			Matcher matcher = patternPassword.matcher(passWord);
			boolean isValid = matcher.find();
			if (isValid)
				return true;
			else
				return false;
		};
		boolean isValid = firstName.validation(fName);
		if (isValid)
			System.out.println("Valid first name");
		else
			throw new UserRegistrationCustomException("Enter Valid first name");
		isValid = lastName.validation(lName);
		if (isValid)
			System.out.println("valid last name");
		else
			throw new UserRegistrationCustomException("Enter Valid last name");
		isValid = email.validation(mail);
		if (isValid)
			System.out.println("Valid email");
		else
			throw new UserRegistrationCustomException("Enter Valid email");
		isValid = phoneNo.validation(phone);
		if (isValid)
			System.out.println("Valid phone number");
		else
			throw new UserRegistrationCustomException("Enter Valid phone number");
		isValid = password.validation(passWord);
		if (isValid)
			System.out.println("Valid password");
		else
			throw new UserRegistrationCustomException("Enter Valid password");
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean check = false;
		while (!check) {
			System.out.println("Enter First Name");
			String fName = sc.nextLine();

			System.out.println("Enter Last Name");
			String lName = sc.nextLine();

			System.out.println("Enter Email");
			String mail = sc.nextLine();

			System.out.println("Enter Phone number");
			String phone = sc.nextLine();

			System.out.println("Enter Password");
			String passWord = sc.nextLine();

			try {
				check = Validation(fName, lName, mail, phone, passWord);

				System.out.println("Validation Successful");

			} catch (UserRegistrationCustomException e) {
				System.out.println(e.getMessage());
				System.out.println("Enter details again");
			}
		}
	}
}
