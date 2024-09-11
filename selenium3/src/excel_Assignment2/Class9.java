package excel_Assignment2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class9
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream l= new FileInputStream("F:\\Excel\\Book1.xlsx");
		
		Sheet sa = WorkbookFactory.create(l).getSheet("Sheet3");
		int ri = sa.getLastRowNum();
		for(int i=0;i<=ri;i++)
		{
			int cel = sa.getRow(i).getLastCellNum();
			for(int j=0;j<=cel-1;j++)
			{
				Cell cl = sa.getRow(i).getCell(j);
				CellType t = cl.getCellType();
				if(t==CellType.STRING)
				{
					String str = cl.getStringCellValue();
					System.out.print(str+ " ");
				}
				else if(t==CellType.BOOLEAN)
				{
					boolean m=cl.getBooleanCellValue();
					System.out.print(m+" ");
				}
				else 
				{
					double k=cl.getNumericCellValue();
					System.out.print(k +" ");
				}
			}
			System.out.println();
		}
		
		
	}

}
