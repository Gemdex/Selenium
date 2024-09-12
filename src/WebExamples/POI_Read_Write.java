package WebExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POI_Read_Write {
	
	public static void main(String args[]) throws Exception{
		FileInputStream fis = new FileInputStream("C:\\Users\\hemam\\OneDrive\\Desktop\\Testing\\Excel_Work\\Write_POI.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("test");//sheetname is given as test
		System.out.println(sheet.getSheetName());
		System.out.println(sheet.getLastRowNum());
		System.out.println("Before updating Cell Data: "+sheet.getRow(2).getCell(1));
		// Write the data to excel file
		XSSFCell cell = sheet.getRow(2).getCell(1);
		cell.setCellValue("Test456");//to write setcellvalue is used
		fis.close();
		FileOutputStream fileOut=new FileOutputStream("C:\\Users\\hemam\\OneDrive\\Desktop\\Testing\\Excel_Work\\Write_POI.xlsx");
		workbook.write(fileOut);//to save excel 
		System.out.println("Updated data after write is done: " + cell.getStringCellValue());
		fileOut.close();
		}

}
