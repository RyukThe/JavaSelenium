package excel_Assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class1
{

public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
{
	FileInputStream file=new FileInputStream("F:\\\\Excel\\\\Book1.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
	int ri = sh.getLastRowNum();
	System.out.println(ri);
	int ci=sh.getRow(0).getLastCellNum()-1;
	short ci1 = sh.getRow(1).getLastCellNum();
	System.out.println(ci1);
       //sh.getLastRowNum()
	//Thread.sleep(20);
	int a=8;
	for(int i=0;i<=1;i++)
	{
		for(int j=0;j<=a;j++)
		{
			String values = sh.getRow(i).getCell(j).getStringCellValue();
			System.out.print(values+" " );
			a--;
		}
		System.out.println();
		//a--;
		
//		for(int k =0;k<=3;k++)
//		{
//			String values = sh.getRow(i).getCell(k).getStringCellValue();
//			System.out.print(values);
//			
//		}
//		
	}
}
}

