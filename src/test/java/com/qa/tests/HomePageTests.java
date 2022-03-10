package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.HomePage;

public class HomePageTests extends BaseTest {

	HomePage obj=new HomePage();
	@Test
	public void sampleTest()
	{
		try
		{
		obj.clickonHome();
		
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
