package getCellType_getAll_data_row_;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class2 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream k= new FileInputStream("F:\\Excel\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(k).getSheet("Sheet3");
		int ci = sh.getRow(2).getLastCellNum();
		for(int i=0;i<=ci-1;i++)
		{
			Cell cel = sh.getRow(2).getCell(i);
			CellType ty = cel.getCellType();
			if(ty==CellType.STRING)
			{
				String str = cel.getStringCellValue();
				System.out.print(str+ " ");
				
			}
			else if(ty==CellType.BOOLEAN)
			{
				boolean bool = cel.getBooleanCellValue();
				System.out.print(bool+" ");
				
			}
			else if (ty==CellType.NUMERIC)
			{
				double num = cel.getNumericCellValue();
				System.out.print(num);
			}
		}
	}

}
