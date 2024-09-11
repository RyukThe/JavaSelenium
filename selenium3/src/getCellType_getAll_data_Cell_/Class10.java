package getCellType_getAll_data_Cell_;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class10 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream l= new FileInputStream("F:\\Excel\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(l).getSheet("Sheet3");
		int ri = sh.getLastRowNum();
		try {
		for(int i=0;i<=ri;i++)
		{
			Cell cel = sh.getRow(i).getCell(1);
			CellType ty = cel.getCellType();
			if(ty==CellType.BOOLEAN)
			{
				boolean bool = cel.getBooleanCellValue();
				System.out.println(bool);
			}
			else if(ty==CellType.NUMERIC)
			{
				double m= cel.getNumericCellValue();
				System.out.println(m);
			}
			else if(ty==CellType.STRING)
			{
				String str=cel.getStringCellValue();
				System.out.println(str);
			}
			
		}
		}
		catch ( Exception o)
		{
			
		}
		
	}

}
