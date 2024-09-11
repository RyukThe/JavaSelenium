package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Class6
{
	public static void main(String[] args) throws IOException
	{
		WebDriver m=new ChromeDriver();
		m.get("https://www.facebook.com/");
		
		File s = ((TakesScreenshot)m).getScreenshotAs(OutputType.FILE);
		
		System.out.println(s);
		
		String rd = RandomString.make(5);
		
		File n= new File("F:\\ScreenShotsel/o"+rd+".jpg");
		FileHandler.copy(s, n);
		
		
		
	}

}
