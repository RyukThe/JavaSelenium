package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Class3 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver n= new ChromeDriver();
		n.navigate().to("https://www.facebook.com/");
		n.manage().window().maximize();
		
		File i = ((TakesScreenshot)n).getScreenshotAs(OutputType.FILE);
		
		System.out.println(i);
		
		String rs = RandomString.make(2);
		
		File i1=new File("F:\\ScreenShotsel//abc"+rs+".jpg");
		
		FileHandler.copy(i, i1);
		
		
	}

}
