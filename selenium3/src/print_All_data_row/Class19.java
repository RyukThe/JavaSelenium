package print_All_data_row;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class19
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream ms= new FileInputStream("F:\\\\Excel\\\\Book1.xlsx");
		Sheet o = WorkbookFactory.create(ms).getSheet("Sheet2");
		int s = o.getRow(1).getLastCellNum();
		
		for(int i=0;i<=s-1;i++)
		{
			String s2 = o.getRow(1).getCell(i).getStringCellValue();
			System.out.print(s2+"  | ");
		}
	}

}
