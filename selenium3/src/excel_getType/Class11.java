package excel_getType;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class11
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream m= new FileInputStream("F:\\Excel\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(m).getSheet("Sheet3");
		CellType typ = sh.getRow(2).getCell(0).getCellType();
		System.out.println(typ);
		
		
	}

}
