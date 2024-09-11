package print_all_data_from_cell;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class20
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream m=new FileInputStream("F:\\\\Excel\\\\Book1.xlsx");
		Sheet s = WorkbookFactory.create(m).getSheet("Sheet2");
		int sh = s.getLastRowNum();
		int sh1=s.getRow(0).getLastCellNum();
		System.out.println(sh);
		System.out.println(sh1);
		for(int i=0;i<=sh;i++)
		{
			String s1 = s.getRow(i).getCell(0).getStringCellValue();
			System.out.println(s1);
		}
		
	}

}
