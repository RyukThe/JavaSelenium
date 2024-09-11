package excel_Assignment2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class6 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream m= new FileInputStream("F:\\Excel\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(m).getSheet("Sheet3");
		int r = sh.getLastRowNum();
		for(int i = 0;i<=r;i++)
		{
			int cl = sh.getRow(i).getLastCellNum();
			for(int j=0;j<=cl-1;j++)
			{
				Cell cel = sh.getRow(i).getCell(j);
				CellType ty = cel.getCellType();
				if(ty==CellType.STRING)
				{
					String str = cel.getStringCellValue();
					System.out.print(str+ " ");
				}
				else if(ty==CellType.BOOLEAN)
				{
					boolean bool=cel.getBooleanCellValue();
					System.out.print(bool+ " ");
				}
				else
				{
					double num=cel.getNumericCellValue();
					System.out.print(num+" ");
				}
			}
			System.out.println();
		}
		
	}

}
