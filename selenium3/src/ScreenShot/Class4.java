package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Class4 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		WebDriver m= new ChromeDriver();
		m.manage().window().maximize();
		m.get("https://www.facebook.com");
		Thread.sleep(200);
		m.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(200);
		
		
		File ss = ((TakesScreenshot)m).getScreenshotAs(OutputType.FILE);
		
		File sss=new File("F:\\ScreenShotsel/worng.jpg");
		
		FileHandler.copy(ss, sss);
		
		
		
	}

}
