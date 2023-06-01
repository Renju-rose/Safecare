package testscripts;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel {

	public static void main(String[] args) throws IOException {
		//file open in writing mode
	    FileOutputStream file=new FileOutputStream (System.getProperty("user.dir")+"\\TestData\\WriteData.xlsx");
	    
	    XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet();
		
		/*for(int r=0;r<=5;r++)
		{
			XSSFRow currentrow=sheet.createRow(r);
			for(int c=0;c<3;c++)
			{
				XSSFCell cell=currentrow.createCell(c);
				cell.setCellValue("welcome");
			}
		}*/
		
		Scanner sc=new Scanner(System.in);
		for(int r=0;r<=3;r++)
		{
			XSSFRow currentrow=sheet.createRow(r);
			for(int c=0;c<3;c++)
			{
				System.out.println("enter value");
				String value=sc.next();//for taking input
				XSSFCell cell=currentrow.createCell(c);
				cell.setCellValue(value);
			}
		}
          workbook.write(file);
          workbook.close();
          file.close();
	}

}
