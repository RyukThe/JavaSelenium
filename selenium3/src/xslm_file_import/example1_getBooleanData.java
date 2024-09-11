package xslm_file_import;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example1_getBooleanData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{	
		FileInputStream file=new FileInputStream("F:\\Excel\\Book1.xlsx");
		
		boolean value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(3).getBooleanCellValue();
		System.out.println(value);
		
	}

}