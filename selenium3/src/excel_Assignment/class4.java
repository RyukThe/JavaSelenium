package excel_Assignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class class4 
{
 public static void main(String[] args) throws EncryptedDocumentException, IOException 
 {
	FileInputStream f=new FileInputStream("F:\\Excel\\Book1.xlsx");
	Sheet s = WorkbookFactory.create(f).getSheet("Sheet2");
	
	int s1 = s.getLastRowNum();
	int s2 = s.getRow(0).getLastCellNum()-1;
	
	int a=s2;
	for(int i=0;i<=s1;i++)
	{
		int s22 = s.getRow(i).getLastCellNum();
		for(int j=0;j<=s22-1;j++)
		{
			String d = s.getRow(i).getCell(j).getStringCellValue();
			System.out.print(d+ " ");
		}
		System.out.println();
		
	}
 }
}
