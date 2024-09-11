package getLastRowNum;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example1_getRowSizeInASheet
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file=new FileInputStream("F:\\\\Excel\\\\Book1.xlsx");
		
		int rowSize = WorkbookFactory.create(file).getSheet("Sheet2").getLastRowNum()+1;
		System.out.println(rowSize);
		
		
		
	}

}