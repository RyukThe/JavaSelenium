package print_all_data_from_cell;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class8 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	FileInputStream m=new FileInputStream("F:\\\\Excel\\\\Book1.xlsx");	
	Sheet s = WorkbookFactory.create(m).getSheet("Sheet2");
	int ro = s.getLastRowNum();
	System.out.println(ro+1);
	for(int i=0;i<=ro-1;i++)
	{
		String s2 = s.getRow(i).getCell(1).getStringCellValue();
		System.out.println(s2);
	}
	
	}

}
