package get_numericdata_as_string;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class11
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream m= new FileInputStream("F:\\Excel\\Book1.xlsx");
		Sheet s = WorkbookFactory.create(m).getSheet("Sheet4");
		
		String sa = s.getRow(0).getCell(1).getStringCellValue();
		System.out.println(sa);
		
	}

}
