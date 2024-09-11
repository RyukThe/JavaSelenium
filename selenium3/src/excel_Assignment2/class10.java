package excel_Assignment2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class class10
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream m= new FileInputStream("F:\\Excel\\Book1.xlsx");
		
		Sheet sh = WorkbookFactory.create(m).getSheet("Sheet3");
		int ri = sh.getLastRowNum();
		for(int i=0;i<=ri;i++)
		{
			
			
		}
		
	}

}
