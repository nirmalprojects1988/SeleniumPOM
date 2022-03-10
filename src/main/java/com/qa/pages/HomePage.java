package com.qa.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.base.Driver;
import com.qa.base.DriverManager;
public class HomePage extends BasePage {

	@FindBy(xpath ="//li[@class='nav-item active']//a[@class='nav-link']")
	WebElement Homelnk;
	
	public void clickonHome()
	{
		//click(By.xpath("//li[@class='nav-item active']//a[@class='nav-link']"));
		//click(Homelnk);
		click(By.xpath("//li[@class='nav-item active']//a[@class='nav-link']"));
		//System.out.println("Clicked");
		//Homelnk.click();
	}
	
}
