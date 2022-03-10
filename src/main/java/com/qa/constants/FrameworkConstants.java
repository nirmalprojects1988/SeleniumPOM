package com.qa.constants;

public class FrameworkConstants {
	
	private FrameworkConstants() {
		
	}
	
	public static final String PROJECTPATH=System.getProperty("user.dir");
	public static final String CHROMEDRIVERPATH =PROJECTPATH+"\\src\\test\\resources\\chromedriver.exe";
	public static final String PROPERTIESFILEPATH=PROJECTPATH+"\\src\\test\\resources\\Project.properties";
	public static final int EXPLICITWAITTIME=10;

}
