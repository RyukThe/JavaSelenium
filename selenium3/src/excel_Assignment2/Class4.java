package excel_Assignment2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class4 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream l= new FileInputStream("F:\\Excel\\Book1.xlsx");
		Sheet s = WorkbookFactory.create(l).getSheet("Sheet3");
		int ro = s.getLastRowNum();
		
		for(int i=0;i<=ro;i++)
		{
			int indc = s.getRow(i).getLastCellNum();
		for(int j=0;j<=indc-1;j++)
		{
			Cell ce = s.getRow(i).getCell(j);
			CellType type = ce.getCellType();
			if(type==CellType.STRING)
			{
				String str = ce.getStringCellValue();
				System.out.print(str+ " ");
			}
			else if(type==CellType.BOOLEAN)
			{
				boolean bol = ce.getBooleanCellValue();
				System.out.print(bol+ " ");
			}
			else if(type == CellType.NUMERIC)
			{
				double nu = ce.getNumericCellValue();
				System.out.print(nu+" ");
			}
					
		}
		System.out.println();
		
		}
		
		
	}

}
