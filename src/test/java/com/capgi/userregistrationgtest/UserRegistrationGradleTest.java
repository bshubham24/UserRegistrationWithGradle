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
}
