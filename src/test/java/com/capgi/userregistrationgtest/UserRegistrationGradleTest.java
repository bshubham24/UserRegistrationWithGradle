package com.capgi.userregistrationgtest;

import org.junit.Assert;
import org.junit.Test;

import com.cagpi.userregistrationg.UserRegistrationCustomException;
import com.cagpi.userregistrationg.UserRegistrationGradle;

public class UserRegistrationGradleTest {

	@Test
	public void FirstNameGood_ReturnTrue() {
		UserRegistrationGradle obj = new UserRegistrationGradle();
		try {
			boolean result = obj.ValidateFirstName("Shubham");
			Assert.assertTrue(result);
		} catch (UserRegistrationCustomException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void FirstNameBad_ReturnFalse() {
		UserRegistrationGradle obj = new UserRegistrationGradle();
		try {
			boolean result = obj.ValidateFirstName("shubham");
			Assert.assertFalse(result);
		} catch (UserRegistrationCustomException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void LastNameGood_ReturnTrue() {
		UserRegistrationGradle obj = new UserRegistrationGradle();
		try {
			boolean result = obj.ValidateLastName("Bhawsar");
			Assert.assertTrue(result);
		} catch (UserRegistrationCustomException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void LastNameBad_ReturnFalse() {
		UserRegistrationGradle obj = new UserRegistrationGradle();
		try {
			boolean result = obj.ValidateLastName("bhawsar");
			Assert.assertFalse(result);
		} catch (UserRegistrationCustomException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void EmailGood_ReturnTrue() {
		UserRegistrationGradle obj = new UserRegistrationGradle();
		try {
			boolean result = obj.ValidateEmail("Shubhambhawsar@gmail.com");
			Assert.assertTrue(result);
		} catch (UserRegistrationCustomException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void EmailBad_ReturnFalse() {
		UserRegistrationGradle obj = new UserRegistrationGradle();
		try {
			boolean result = obj.ValidateEmail("sdfaddf..@@.com");
			Assert.assertFalse(result);
		} catch (UserRegistrationCustomException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void PhoneNoGood_ReturnTrue() {
		UserRegistrationGradle obj = new UserRegistrationGradle();
		try {
			boolean result = obj.ValidatePhoneNo("91 9874563210");
			Assert.assertTrue(result);
		} catch (UserRegistrationCustomException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void PhoneNOBad_ReturnFalse() {
		UserRegistrationGradle obj = new UserRegistrationGradle();
		try {
			boolean result = obj.ValidatePhoneNo("84568522");
			Assert.assertFalse(result);
		} catch (UserRegistrationCustomException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void PasswordGood_ReturnTrue() {
		UserRegistrationGradle obj = new UserRegistrationGradle();
		try {
			boolean result = obj.ValidatePassword("Kb@3kdkkddddd");
			Assert.assertTrue(result);
		} catch (UserRegistrationCustomException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void PasswordNOBad_ReturnFalse() {
		UserRegistrationGradle obj = new UserRegistrationGradle();
		try {
			boolean result = obj.ValidatePassword("84568522");
			Assert.assertFalse(result);
		} catch (UserRegistrationCustomException e) {
			System.out.println(e.getMessage());
		}
	}
}
