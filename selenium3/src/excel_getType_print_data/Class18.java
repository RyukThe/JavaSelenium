package excel_getType_print_data;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class18 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream k= new FileInputStream("F:\\Excel\\Book1.xlsx");
		Sheet s = WorkbookFactory.create(k).getSheet("Sheet2");
		Cell ce = s.getRow(1).getCell(3);
		CellType sa = ce.getCellType();
		if(sa==CellType.STRING)
		{
			String str = ce.getStringCellValue();
			System.out.println(str);
		}
		else if(sa==CellType.BOOLEAN)
		{
			boolean bo = ce.getBooleanCellValue();
			System.out.println(bo);
			
		}
		else if(sa==CellType.NUMERIC)
		{
			double num = ce.getNumericCellValue();
			System.out.println(num);
			
			
		}
		
		
	}

}
