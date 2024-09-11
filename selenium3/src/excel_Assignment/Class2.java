package excel_Assignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class2
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream m= new FileInputStream("F:\\\\Excel\\\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(m).getSheet("Sheet2");
		int sa = sh.getLastRowNum();
		int saw = sh.getRow(0).getLastCellNum()-1;
	
//		try 
//		{
//			int a=saw;
//			for(int i=0;i<=sa;i++)
//			{
//				for(int j=0;j<=a;j++)
//				{
//					String s = sh.getRow(i).getCell(j).getStringCellValue();
//					System.out.print(s+ " ");
//				}
//				System.out.println();
//				a=saw-1;
//				
//			
//			}
//			
//		} 
//		catch(ArithmeticException o)
//		{
//			
//		}
//		catch (Exception e) 
//		{
//		
//		}
		
		int a=saw;
	
		for(int i=0;i<=sa;i++)
		{
			for(int j=0;j<=a;j++)
			{
				String s = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(s+ " ");
			}
			System.out.println();
			a--;
		
	}
		
	}

}
