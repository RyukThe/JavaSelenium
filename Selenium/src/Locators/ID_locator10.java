package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID_locator10 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
		WebDriver d=new ChromeDriver();
		
		d.get("file:///D:/locator.html");
		
		d.findElement(By.id("123")).sendKeys("sdasasd");
		
		d.findElement(By.id("123")).sendKeys("asdad");
		
		Thread.sleep(2000);
		d.close();
	}
}
