package getCellType_getAll_data_row_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream l= new FileInputStream("F:\\Excel\\Book1.xlsx");
		Sheet Sa = WorkbookFactory.create(l).getSheet("Sheet3");
		
		int ci = Sa.getRow(0).getLastCellNum();
		for(int i=0;i<=ci-1;i++)
		{
			Cell ce = Sa.getRow(0).getCell(i);
			CellType typ = ce.getCellType();
			if(typ==CellType.BOOLEAN)
			{
				boolean bool = ce.getBooleanCellValue();
				System.out.print(bool+ " ");
			}
			else if (typ==CellType.NUMERIC)
			{
				double num = ce.getNumericCellValue();
				System.out.print(num + " ");
				
			}
			else if(typ==CellType.STRING)
			{
				String Str = ce.getStringCellValue();
				System.out.print(Str+ " ");
			}
		}
		
		
	}

}
