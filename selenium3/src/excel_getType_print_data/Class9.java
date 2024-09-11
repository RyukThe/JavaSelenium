package excel_getType_print_data;

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
		FileInputStream n= new FileInputStream("F:\\Excel\\Book1.xlsx");
		Sheet sheet = WorkbookFactory.create(n).getSheet("Sheet3");
		Cell cel = sheet.getRow(1).getCell(1);
		CellType ty = cel.getCellType();
		if(ty==CellType.BOOLEAN)
		{
			boolean bool = cel.getBooleanCellValue();
			System.out.println(bool);
		}
		else if(ty==CellType.NUMERIC)
		{
			double num = cel.getNumericCellValue();
			System.out.println(num);
		}
		else if (ty==CellType.STRING)
		{
			String Str = cel.getStringCellValue();
			System.out.println(Str);
			
		}
		
	}

}
