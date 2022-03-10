package com.qa.pages;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.qa.constants.FrameworkConstants;
import com.qa.base.DriverManager;

public class BasePage {
	protected BasePage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}
	private static void explicitlyWait(WebElement element) {
		WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(),FrameworkConstants.EXPLICITWAITTIME);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static void click(WebElement element)  {
		element.click();
	}
//	public static void click(By by)
//	{
//		DriverManager.getDriver().findElement(by).click();
//	}
	public static void click(By by)  {
		click(DriverManager.getDriver().findElement(by));
	}
	public static void sendkeys(WebElement element, String text)  {
		element.sendKeys(text);
	}
	public static void sendkeys(By by, String text)  {
		sendkeys(DriverManager.getDriver().findElement(by), text);
	}
	
	public static void moveToElement(WebElement element) {
		Actions actions= new Actions(DriverManager.getDriver());
		actions.moveToElement(element).build().perform();
	}
	public static void moveToElement(By by) {
		moveToElement(DriverManager.getDriver().findElement(by));
	}
	public static void switchToNewWindow() {
		String parentWinHandle = DriverManager.getDriver().getWindowHandle();
		Set<String> winHandles = DriverManager.getDriver().getWindowHandles();
		for(String temp:winHandles) {
			if(!temp.equalsIgnoreCase(parentWinHandle)) {
				DriverManager.getDriver().switchTo().window(temp);
				
			}
		}
	}
	public static void selectByValue(WebElement element,String text) {
		new Select(element).selectByValue(text);
		
	}
	
	public static void selectByVisibleText(WebElement element,String text) {
		new Select(element).selectByVisibleText(text);
		
	}
	
	public static void selectByIndex(WebElement element,int index) {
		new Select(element).selectByIndex(index);
		
	}
	
}
