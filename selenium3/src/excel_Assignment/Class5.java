package excel_Assignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class5 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream m= new FileInputStream("F:\\Excel\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(m).getSheet("Sheet2");
		int ri = sh.getLastRowNum();
		
		for(int i=0;i<=ri;i++)
		{
			int ci = sh.getRow(i).getLastCellNum();
			for(int j=0;j<=ci-1;j++)
			{
				String s =sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(s+ " ");
			}
			System.out.println();
		}
		
	}

}
