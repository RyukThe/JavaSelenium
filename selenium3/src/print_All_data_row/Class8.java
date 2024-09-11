package print_All_data_row;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class8 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream m= new FileInputStream("F:\\\\Excel\\\\Book1.xlsx");
		Sheet saq = WorkbookFactory.create(m).getSheet("Sheet2");
		int sa = saq.getRow(3).getLastCellNum();
		for(int i=0;i<=sa-1;i++)
		{
			String s = saq.getRow(3).getCell(i).getStringCellValue();
			System.out.print(s + " | ");
		}
		
	}

}
