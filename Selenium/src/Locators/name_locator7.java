package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class name_locator7
{
	public static void main(String[] args) 
	{
       System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("file:///D:/locator.html");
		
		d.findElement(By.name("xyz")).sendKeys("weffgtrt");
		d.findElement(By.name("xyz")).sendKeys("dwdwd");
	}
}
