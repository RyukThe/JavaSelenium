package getFirstSelectedOption;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class2 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		
		FileInputStream f= new FileInputStream("F:\\\\Excel\\\\Book1.xlsx");
	
		Sheet sh = WorkbookFactory.create(f).getSheet("Sheet2");
		int r = sh.getLastRowNum();
	int cl = sh.getRow(0).getLastCellNum();
	System.out.println(cl);
	for(int i=0;i<=r;i++)
	{
		String s = sh.getRow(i).getCell(0).getStringCellValue();
		System.out.println(s);
	}
	}

}
