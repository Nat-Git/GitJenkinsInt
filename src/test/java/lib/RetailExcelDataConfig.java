package lib;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RetailExcelDataConfig {

	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public RetailExcelDataConfig(String excelPath)
	{
	
		try {
			FileInputStream FIP=new FileInputStream((System.getProperty("user.dir")+excelPath));
			//FileInputStream FIP=new FileInputStream(excelPath);
			wb=new XSSFWorkbook(FIP);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	
	
	public String getData(String sheetName, int row, int column)
	{
		//sheet = wb.getSheetAt(sheetNumber);
		sheet = wb.getSheet(sheetName);
		String data = sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
	}
	
	
	
}
