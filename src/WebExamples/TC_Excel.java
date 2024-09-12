package WebExamples;

import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;

public class TC_Excel {

	public static void main(String args[]) throws Exception{
		FileInputStream file=new FileInputStream("C:\\Users\\hemam\\OneDrive\\Desktop\\Testing\\Excel_Work\\Read_9703.xls");
		Workbook wb=Workbook.getWorkbook(file);
		//C:\Users\hemam\OneDrive\Desktop\Testing\Excel_Work
		Sheet st=wb.getSheet(0);
		int row=3;
		String empid=st.getCell(0,row).getContents();
		String name=st.getCell(1,row).getContents();
		String email=st.getCell(2,row).getContents();
		String no=st.getCell(3,row).getContents();
		System.out.println(empid+"||"+name+"||"+email+"||"+no);
	}
	
}
