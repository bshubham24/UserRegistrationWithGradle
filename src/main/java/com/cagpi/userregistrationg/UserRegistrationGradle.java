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
				.compile("(^([a-z]+)([+._-]{0,1})([0-9a-z]*)([@]{1})([a-z0-9]+)(.([a-z]{2,})){1}(.[a-z][a-z])?$)");
		Matcher matcher = pattern.matcher(email);
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
		 */
		System.out.println("Enter Email");
		String email = sc.nextLine();
		userObj.ValidateEmail(email);
	}
}
