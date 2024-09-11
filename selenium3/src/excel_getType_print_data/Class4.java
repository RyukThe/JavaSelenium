package excel_getType_print_data;

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
		FileInputStream k= new FileInputStream("F:\\Excel\\Book1.xlsx");
		Sheet p = WorkbookFactory.create(k).getSheet("Sheet3");
		
		Cell cel = p.getRow(0).getCell(2);
		CellType typ = cel.getCellType();
		if(typ==CellType.BOOLEAN)
		{
			boolean bo = cel.getBooleanCellValue();
			System.out.println(bo);
			
		}
		else if(typ==CellType.NUMERIC)
		{
			double m=cel.getNumericCellValue();
			System.out.println(m);
			
			
		}
		else if (typ==CellType.STRING)
		{
			
			String sa = cel.getStringCellValue();
			
			System.out.println(sa);
			
		}
		
		
	}

}
