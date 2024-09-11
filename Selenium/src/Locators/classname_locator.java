package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classname_locator 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("D:\\Velocity testing notes\\Automation Testing\\Html files\\locator.html");
		
		d.findElement(By.className("abc123")).sendKeys("rita");
		d.findElement(By.className("abc123")).sendKeys("sita");
		
		d.close();
	}
}
