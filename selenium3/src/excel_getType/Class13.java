package excel_getType;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class13 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream i= new FileInputStream("F:\\Excel\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(i).getSheet("Sheet3");
		CellType ty = sh.getRow(0).getCell(2).getCellType();
		System.out.println(ty);
		
		
	}

}
