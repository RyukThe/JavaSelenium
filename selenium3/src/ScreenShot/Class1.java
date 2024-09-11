package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Class1
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		WebDriver m= new ChromeDriver();
		m.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		File src = ((TakesScreenshot)m).getScreenshotAs(OutputType.FILE);
		
		System.out.println(src);
	
		
		File des= new File("F:\\ScreenShotsel\\abc.jpg");
		
		FileHandler.copy(src, des);
		
		
	}

}
