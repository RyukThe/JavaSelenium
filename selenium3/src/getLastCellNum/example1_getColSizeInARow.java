package getLastCellNum;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example1_getColSizeInARow
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file=new FileInputStream("F:\\\\Excel\\\\Book1.xlsx");
		
		int colSize = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
		System.out.println(colSize);
		
		
	}

}