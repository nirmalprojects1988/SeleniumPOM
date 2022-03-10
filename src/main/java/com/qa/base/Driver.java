package com.qa.base;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.qa.base.DriverManager;
import com.qa.constants.FrameworkConstants;
import com.qa.utils.ReadPropertyFile;

public class Driver {

	public WebDriver driver = null;
	public DesiredCapabilities capability;

	private Driver() throws MalformedURLException {

//		BrowserType browserval = BrowserType.valueOf(ReadPropertyFile.get("Browser"));
//
//		switch (browserval) {
//		case Chrome:
//			System.setProperty("webdriver.chrome.driver", FrameworkConstants.CHROMEDRIVERPATH);
//			driver = new ChromeDriver();
//			break;
////		case Firefox:
////			System.setProperty("webdriver.chrome.driver", FrameworkConstants.CHROMEDRIVERPATH);
////			driver = new ChromeDriver();
////			break;
		//}
		String val=ReadPropertyFile.get("Browser");
		System.out.println(val);

		if (ReadPropertyFile.get("Browser").equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", FrameworkConstants.CHROMEDRIVERPATH);
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--incognito");
			
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			// driver.manage().timeouts().implicitlyWait(Integer.parseInt(ReadPropertyFile.get("WaitTime")),
			// TimeUnit.SECONDS);
			// EventHandlerInit();
			driver.get(ReadPropertyFile.get("url"));
			driver.manage().deleteAllCookies();
			DriverManager.setWebDriver(driver);


		}
		

	}

	public static void initialize() {
		if (DriverManager.getDriver() == null)
			try {
				new Driver();
			} catch (Exception e) {
				System.out.println(e.toString());
			}
	}

	public static void quit() {
		if (DriverManager.getDriver() != null) {
			DriverManager.getDriver().quit();
		}
	}

}
