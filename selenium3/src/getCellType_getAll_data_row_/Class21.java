package getCellType_getAll_data_row_;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class21 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream m= new FileInputStream("F:\\Excel\\Book1.xlsx");
	Sheet sh = WorkbookFactory.create(m).getSheet("Sheet3");
	int cl = sh.getRow(0).getLastCellNum();
	for(int i=0;i<=cl-1;i++)
	{
		Cell ro = sh.getRow(0).getCell(i);
		CellType ty = ro.getCellType();
		if (ty==CellType.STRING)
		{
			String v = ro.getStringCellValue();
			System.out.print(v+" ");
		}
		if(ty==CellType.BOOLEAN)
		{
			boolean bool = ro.getBooleanCellValue();
			System.out.print(bool+" ");
		}
		else
		{
			double num = ro.getNumericCellValue();
			System.out.print(num+" ");
		}
	}
	
	
}
}
