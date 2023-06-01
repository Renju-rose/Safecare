package testscripts;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadExcel {

	public static void main(String[] args) throws IOException
	{
		//FileInputStream file=new FileInputStream("C:\\Users\\RR-2074\\eclipse-workspace\\SeleniumAutomation\\TestData\\Book1.xlsx");

		//file open in reading mode
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\TestData\\Book1.xlsx");
		
		//workbook
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		//No.of rows & columns
		int total_rows=sheet.getLastRowNum();
		int total_column=sheet.getRow(1).getLastCellNum();
		
		System.out.println(total_rows);
		System.out.println(total_column);
		
		for(int r=0;r<=total_rows;r++)
		{
			XSSFRow currentrow=sheet.getRow(r);
			for(int c=0;c<total_column;c++)
			{
				XSSFCell cell=currentrow.getCell(c);
				String value=cell.toString();
				System.out.print(value+"    ");
			}
			System.out.println( );
		}
		workbook.close();
	    file.close();
	}

}
