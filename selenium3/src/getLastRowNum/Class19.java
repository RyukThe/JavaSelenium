package getLastRowNum;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class19
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream m= new FileInputStream("F:\\\\Excel\\\\Book1.xlsx");
		Sheet set = WorkbookFactory.create(m).getSheet("Sheet2");
		int s = set.getLastRowNum()+1;
		System.out.println(s);
	}
}
