package WebExamples;

import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;

public class Excel_ReadAllRows {
	public static void main(String args[]) throws Exception{
		   FileInputStream file = new FileInputStream("C:\\Users\\hemam\\OneDrive\\\\Desktop\\Testing\\Excel_Work\\Read_9703.xls");
		   Workbook wb = Workbook.getWorkbook(file);
		   Sheet st = wb.getSheet(0);
		   int rowcount = st.getRows();
		   System.out.println(rowcount);
		   for(int i=1; i<rowcount; i++) {
		   String empid = st.getCell(0,i).getContents();
		   String name = st.getCell(1,i).getContents();
		   String email = st.getCell(2,i).getContents();
		   String no = st.getCell(3,i).getContents();
		   System.out.println(empid+"||"+name+"||"+email+"||"+no);
		   }
		   
		}
}
