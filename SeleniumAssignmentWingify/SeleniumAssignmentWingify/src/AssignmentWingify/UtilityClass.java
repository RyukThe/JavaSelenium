package AssignmentWingify;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	//this method is used to get data from Excel Sheet
		//need to pass two pass two parameters
		//@Authour:Divya
		public static String getTD(int rowIndex,int colIndex) throws EncryptedDocumentException, IOException
		{
			
			FileInputStream file=new FileInputStream("Desktop\\Book1.xlsx");
			Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");

			String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
			return value;
		}
		//this method is used to capture the ss
		//need to pass two parameters 1.WebDriver Object 2.TCID
		//@Author:abc
		
		public static void capturess(WebDriver driver,int TCID) throws IOException
		{
			 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

			 File dest=new File("C:\\Users\\Sai\\Desktop\\Selenium\\ScreenShots\\wingify"+TCID+".png");
			 FileHandler.copy(src, dest);
			 
		}
		public static String readDatafromPropertyFile(String key) throws IOException
		
		{
			FileInputStream file=new FileInputStream("C:\\Users\\daduk\\Downloads\\SeleniumAssignmentWingify\\values.properties");
			Properties p=new Properties();
			p.load(file);
			String value = p.getProperty(key);
			return value;
		}



}
