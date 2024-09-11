package excel_Assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class3 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream s= new FileInputStream("F:\\Excel\\Book1.xlsx");
		Sheet sk = WorkbookFactory.create(s).getSheet("Sheet2");
		int k = sk.getLastRowNum();
		int kl=sk.getRow(0).getLastCellNum()-1;
		
		int a=kl;
		for(int i=0;i<=k;i++)
		{
			for(int j=0;j<=a;j++)
			{
				String sa = sk.getRow(i).getCell(j).getStringCellValue();
				System.out.print(sa+" ");
			}
			System.out.println();
			a--;
		}
	}

}
