package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID_locator9 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
		WebDriver d=new ChromeDriver();
		
		d.get("file:///D:/locator.html");
		
		d.findElement(By.id("123")).sendKeys("dfeds");
		
		d.findElement(By.id("123")).sendKeys("vfgd");
		
		Thread.sleep(2000);
		d.close();
	}
}
