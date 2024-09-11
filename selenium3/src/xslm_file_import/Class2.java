package xslm_file_import;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class2 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file= new FileInputStream("F:\\Excel\\Book1.xlsx");
		
		double vlaue = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(2).getNumericCellValue();
		System.out.println(vlaue);
//		Workbook book = WorkbookFactory.create(file);
//		Sheet sh = book.getSheet("Sheet1");
//		Row row = sh.getRow(0);
//		Cell cl = row.getCell(2);
//		double value = cl.getNumericCellValue();
//		System.out.println(value);
		
	}

}
