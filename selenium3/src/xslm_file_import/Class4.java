package xslm_file_import;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class4
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream m= new FileInputStream("F:\\Excel\\Book1.xlsx");
		String s=WorkbookFactory.create(m).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(s);
		
	}

}
