package excel_getType;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class12
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream st=new FileInputStream("F:\\Excel\\Book1.xlsx");
		Sheet s = WorkbookFactory.create(st).getSheet("Sheet3");
		CellType sa = s.getRow(0).getCell(0).getCellType();
		System.out.println(sa);
		
	}

}
