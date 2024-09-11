package excel_Assignment2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class7 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream k= new FileInputStream("F:\\Excel\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(k).getSheet("Sheet3");
		int sa = sh.getLastRowNum();
	
		for(int i=0;i<=sa;i++)
		{
			int ce = sh.getRow(i).getLastCellNum();
			for(int j= 0;j<=ce-1;j++)
			{
				Cell cel = sh.getRow(i).getCell(j);
				 CellType tye = cel.getCellType();
				System.out.print(tye + " ");
			}
			System.out.println();
		}
		
	}

}
