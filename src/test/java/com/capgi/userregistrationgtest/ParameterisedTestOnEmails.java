package com.capgi.userregistrationgtest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.cagpi.userregistrationg.UserRegistrationCustomException;
import com.cagpi.userregistrationg.UserRegistrationGradle;

@RunWith(Parameterized.class)
public class ParameterisedTestOnEmails {

	private String emailTypes;
	private boolean expectedResult;

	public ParameterisedTestOnEmails(String emailTypes, boolean expectedResult) {
		this.emailTypes = emailTypes;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
				{ "abc+100@gmail.com", true }, { "abc", false }, { "abc@.com.my", false }, { "abc123@gmail.a", false },
				{ "abc123@.com", false }, { "abc123@.com.com", false }, { ".abc@abc.com", false },
				{ "abc()*@gmail.com", false }, { "abc@%*.com", false }, { "abc..2002@gmail.com", false },
				{ "abc.@gmail.com", false }, { "abc@abc@gmail.com", false }, { "abc@gmail.com.1a", false },
				{ "abc@gmail.com.aa.au", false } });

	}

	@Test
	public void testEmail() {
		UserRegistrationGradle obj = new UserRegistrationGradle();
		try {
			boolean result = obj.Validation("Shubham", "Bhawsar", this.emailTypes, "91 7412589633", "Akk@122kkkd");
			Assert.assertEquals(this.expectedResult, result);
		} catch (UserRegistrationCustomException e) {
			System.out.println(e.getMessage());
		}
	}
}
