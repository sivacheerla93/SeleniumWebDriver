package com.parameters;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class LoginClass {

	private String user;
	private String pwd;
	Login l1;

	public LoginClass(String user, String pwd) {
		this.user = user;
		this.pwd = pwd;
	}

	@Before
	public void setup() {
		l1 = new Login();
	}

	@Parameters
	public static Collection<Object[]> testData() {
		Object[][] data = new Object[][] { { "user1@gmail.com", "********" }, { "user1@gmail.com", "********" } };
		return Arrays.asList(data);
	}

	@Test
	public void testLogin() {
		l1.loginMethod(user, pwd);
	}
}
