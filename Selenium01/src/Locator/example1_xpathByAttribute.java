package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_xpathByAttribute 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
		"D:\\selenium\\chromedriver.exe");  	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Rushikesh");
		
		//enter pwd
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Rushi@123");
		
		//click on login btn
		driver.findElement(By.xpath("//button[@name='login']")).click();	
		
		
	}
}


