package getLastCellNum;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class4
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream m= new FileInputStream("F:\\\\Excel\\\\Book1.xlsx");
		Sheet h = WorkbookFactory.create(m).getSheet("Sheet2");
		int cell = h.getRow(0).getLastCellNum();
		System.out.println(cell);
		
		
	}

}
