package com.qa.utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static void main(String[] args) {
		getRowCount();	
	}
	public static final String PROJECTPATH=System.getProperty("user.dir");
	public static final String EXCELFILEPATH =PROJECTPATH+"/src/test/resources/Excelfiles/data.xlsx";
	public static void getRowCount() {
		try {
			System.out.println(PROJECTPATH);
			System.out.println(EXCELFILEPATH);
		XSSFWorkbook workbook=new XSSFWorkbook(EXCELFILEPATH);
		XSSFSheet sheet1=workbook.getSheetAt(0);
		int rowcount=sheet1.getLastRowNum();
		System.out.println(rowcount);
		workbook.close();
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		
	}
}
