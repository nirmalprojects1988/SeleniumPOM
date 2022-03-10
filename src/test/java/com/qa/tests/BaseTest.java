package com.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.DriverManager;
import com.qa.base.Driver;

public class BaseTest {

	@BeforeMethod
	public void setUp() {
		try {
			Driver.initialize();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@AfterMethod
	public void wrapUp() {
		DriverManager.getDriver().close();
	}

}
