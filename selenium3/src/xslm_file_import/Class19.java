package xslm_file_import;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class19 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		Class19 Excel = new Class19();
		Excel.m1();
		
		Excel.m2();
		Excel.m3();
		
		
	}

		
	public void m1() throws EncryptedDocumentException, IOException
	{
		FileInputStream s= new FileInputStream("F:\\Excel\\Book1.xlsx");
		Workbook b = WorkbookFactory.create(s);
		Sheet sheet = b.getSheet("Sheet1");
		Row r = sheet.getRow(0);
		Cell cl = r.getCell(1);
		String v = cl.getStringCellValue();
		System.out.println(v);
	}
	public void m2() throws EncryptedDocumentException, IOException
	{
		FileInputStream s=new FileInputStream("F:\\Excel\\Book1.xlsx");
		double v = WorkbookFactory.create(s).getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
		System.out.println(v);
	}
	
	public void m3() throws EncryptedDocumentException, IOException
	{
		FileInputStream k= new FileInputStream("F:\\Excel\\Book1.xlsx");
		boolean v = WorkbookFactory.create(k).getSheet("Sheet1").getRow(0).getCell(3).getBooleanCellValue();
		System.out.println(v);
	}
}
