package print_all_data_from_cell;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream l= new FileInputStream("F:\\Excel\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(l).getSheet("Sheet1");
		
		int ci = sh.getRow(0).getLastCellNum();
		int ro = sh.getLastRowNum();
		
		for(int i=0;i<=ro;i++)
		{
			String str = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(str);
		}
	}

}
