package p1;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	String x=readFromExcel("E:\\Java\\Chaitanya.xls","Sheet1",1,1);
	System.out.println("Data from Excel is: " +x);
	}
	
	public static String readFromExcel(String filePath, String sheetName, int row,int col )
	{
		String sdata;
		try{
			File src=new File(filePath);
			FileInputStream fis=new FileInputStream(src);
			HSSFWorkbook wb=new HSSFWorkbook(fis);
			HSSFSheet sh1= wb.getSheet(sheetName);
			sdata=sh1.getRow(row).getCell(col).getStringCellValue();
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
			sdata=null;
		}
		
		return sdata;

	}

}
