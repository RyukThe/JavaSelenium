package xslm_file_import;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class21 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream st= new FileInputStream("F:\\Excel\\Book1.xlsx");
		Workbook bok = WorkbookFactory.create(st);
		
		Sheet sh = bok.getSheet("Sheet1");
		Row r = sh.getRow(1);
		Cell c = r.getCell(0);
		String s = c.getStringCellValue();
		System.out.println(s);
		
		Class21 n = new Class21();
		n.Boolean();
		n.numeric();
		
	}
	
	public void Boolean() throws EncryptedDocumentException, IOException 
	{
		FileInputStream m= new FileInputStream("F:\\Excel\\Book1.xlsx");
		boolean st = WorkbookFactory.create(m).getSheet("Sheet1").getRow(1).getCell(3).getBooleanCellValue();
		System.out.println(st);
		
	}
	
	public void numeric() throws EncryptedDocumentException, IOException
	{
		FileInputStream m= new FileInputStream("F:\\Excel\\Book1.xlsx");
		double k=WorkbookFactory.create(m).getSheet("Sheet1").getRow(1).getCell(2).getNumericCellValue();
		System.out.println(k);
	}

}
