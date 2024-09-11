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

public class example1_getNumericData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file=new FileInputStream("F:\\Excel\\Book1.xlsx");
		
	double value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(2).getNumericCellValue();
	System.out.println(value);	
	
		
	}

}
