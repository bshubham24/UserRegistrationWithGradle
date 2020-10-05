package com.capgi.userregistrationgtest;

import org.junit.Assert;
import org.junit.Test;

import com.cagpi.userregistrationg.UserRegistrationCustomException;
import com.cagpi.userregistrationg.UserRegistrationGradle;

public class UserRegistrationGradleTest {

	@Test
	public void WhenEverthingIsGood_ReturnTrue() {
		UserRegistrationGradle obj = new UserRegistrationGradle();
		try {
			boolean result = obj.Validation("Shubham", "Bhawsar", "shubham007@gamil.com", "91 7412589633",
					"Akk@122kkkd");
			Assert.assertTrue(result);
		} catch (UserRegistrationCustomException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void FirstNameBad_ReturnFalse() {
		UserRegistrationGradle obj = new UserRegistrationGradle();
		try {
			boolean result = obj.Validation("shubham", "Bhawsar", "shubham007@gamil.com", "91 7412589633",
					"Akk@122kkkd");
			Assert.assertFalse(result);
		} catch (UserRegistrationCustomException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void LastNameBad_ReturnFalse() {
		UserRegistrationGradle obj = new UserRegistrationGradle();
		try {
			boolean result = obj.Validation("Shubham", " bhawsar", "shubham007@gamil.com", "91 7412589633",
					"Akk@122kkkd");
			Assert.assertFalse(result);
		} catch (UserRegistrationCustomException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void EmailBad_ReturnFalse() {
		UserRegistrationGradle obj = new UserRegistrationGradle();
		try {
			boolean result = obj.Validation("Shubham", "Bhawsar", "sdfaddf..@@.com", "91 7412589633", "Akk@122kkkd");
			Assert.assertFalse(result);
		} catch (UserRegistrationCustomException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void PhoneNOBad_ReturnFalse() {
		UserRegistrationGradle obj = new UserRegistrationGradle();
		try {
			boolean result = obj.Validation("Shubham", "Bhawsar", "shubham007@gamil.com", "84568522", "Akk@122kkkd");
			Assert.assertFalse(result);
		} catch (UserRegistrationCustomException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void PasswordNOBad_ReturnFalse() {
		UserRegistrationGradle obj = new UserRegistrationGradle();
		try {
			boolean result = obj.Validation("Shubham", "Bhawsar", "shubham007@gamil.com", "91 7412589633", "84568522");
			Assert.assertFalse(result);
		} catch (UserRegistrationCustomException e) {
			System.out.println(e.getMessage());
		}
	}
}
