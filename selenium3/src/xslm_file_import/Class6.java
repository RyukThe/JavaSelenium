package xslm_file_import;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Class6 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	FileInputStream file=new FileInputStream("F:\\Excel\\Book1.xlsx");
	 String s = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	 //	String s1 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	 System.out.println(s);
	 
	}
	
	

}
