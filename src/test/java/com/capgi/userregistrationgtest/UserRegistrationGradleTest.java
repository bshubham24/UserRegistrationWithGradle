package com.capgi.userregistrationgtest;

import org.junit.Assert;
import org.junit.Test;

import com.cagpi.userregistrationg.UserRegistrationGradle;

public class UserRegistrationGradleTest {

	@Test
	public void FirstNameGood_ReturnTrue() {
		UserRegistrationGradle obj = new UserRegistrationGradle();
		boolean result = obj.ValidateFirstName("Shubham");
		Assert.assertTrue(result);
	}

	@Test
	public void FirstNameGood_ReturnFalse() {
		UserRegistrationGradle obj = new UserRegistrationGradle();
		boolean result = obj.ValidateFirstName("shubham");
		Assert.assertFalse(result);
	}

	@Test
	public void LastNameGood_ReturnTrue() {
		UserRegistrationGradle obj = new UserRegistrationGradle();
		boolean result = obj.ValidateFirstName("Bhawsar");
		Assert.assertTrue(result);
	}

	@Test
	public void LastNameGood_ReturnFalse() {
		UserRegistrationGradle obj = new UserRegistrationGradle();
		boolean result = obj.ValidateFirstName("bhawsar");
		Assert.assertFalse(result);
	}

}
