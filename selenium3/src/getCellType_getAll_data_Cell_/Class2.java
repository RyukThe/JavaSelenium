package getCellType_getAll_data_Cell_;

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
		FileInputStream m= new FileInputStream("F:\\Excel\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(m).getSheet("Sheet3");
		
		int ri=sh.getLastRowNum();
		for (int i=0;i<=ri;i++)
		{
			 Cell c = sh.getRow(i).getCell(0);
			 CellType ty = c.getCellType();
			 if(ty==CellType.STRING)
			 {
				 String str=c.getStringCellValue();
				 System.out.println(str);
			 }
			 else if (ty==CellType.NUMERIC)
			 {
				 double num=c.getNumericCellValue();
				 System.out.println(num);
			 }
			 else if(ty==CellType.BOOLEAN)
			 {
				 boolean bool=c.getBooleanCellValue();
				 System.out.println(bool);
			 }
		}
		
		
	}

}
