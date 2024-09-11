package excel_Assignment2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class3
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream m= new FileInputStream("F:\\Excel\\Book1.xlsx");
		Sheet sheet = WorkbookFactory.create(m).getSheet("Sheet3");
		int ri = sheet.getLastRowNum();
		for(int i =0;i<=ri;i++)
		{
			int celi = sheet.getRow(i).getLastCellNum();
			for(int j=0;j<=celi-1;j++)
			{
				Cell cl = sheet.getRow(i).getCell(j);
				CellType typ = cl.getCellType();
				if(typ==CellType.STRING)
				{
					String s=cl.getStringCellValue();
					System.out.print(s+" ");
				}
				else if(typ==CellType.NUMERIC)
				{
					double num= cl.getNumericCellValue();
					System.out.print(num+" ");
				}
				else if (typ==CellType.BOOLEAN)
				{
					boolean bool=cl.getBooleanCellValue();
					System.out.print(bool+" ");
				}
				
			}
			System.out.println();
		}
	
		
		
	}

}
