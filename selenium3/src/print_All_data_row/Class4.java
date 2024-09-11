package print_All_data_row;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class4
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream s= new FileInputStream("F:\\\\Excel\\\\Book1.xlsx");
		Sheet sa = WorkbookFactory.create(s).getSheet("Sheet2");
		int r = sa.getLastRowNum();
		int el = sa.getRow(0).getLastCellNum();
		System.out.println(r);
		System.out.println(el);
		for(int i=0;i<=el-1;i++)
		{
			String saw = sa.getRow(0).getCell(i).getStringCellValue();
			System.out.print(saw+ " ");
		}
	}

}
