package getLastRowNum;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class18 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream m= new FileInputStream("F:\\\\Excel\\\\Book1.xlsx");
		Sheet sheet = WorkbookFactory.create(m).getSheet("Sheet2");
		int row = sheet.getLastRowNum()+1;
		System.out.println(row);
		
	}

}
