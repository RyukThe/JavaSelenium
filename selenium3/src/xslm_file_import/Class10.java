package xslm_file_import;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class10 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		m1();
		m2();
		m3();
		
	}
	public static void m1() throws EncryptedDocumentException, IOException 
	{
		FileInputStream k= new FileInputStream("F:\\Excel\\Book1.xlsx");
		Boolean m=WorkbookFactory.create(k).getSheet("Sheet1").getRow(0).getCell(3).getBooleanCellValue();
		System.out.println(m);
		
	}
	public static void m2() throws EncryptedDocumentException, IOException 
	{
		FileInputStream m= new FileInputStream("F:\\Excel\\Book1.xlsx");
		 
		Workbook st = WorkbookFactory.create(m);
		Sheet sh = st.getSheet("Sheet1");
		Row r = sh.getRow(0);
		Cell c = r.getCell(2);
		double v = c.getNumericCellValue();
		System.out.println(v);
		
	}
	
	public static void m3() throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream m= new FileInputStream("F:\\Excel\\Book1.xlsx");
		String s=WorkbookFactory.create(m).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(s);
	}

}
