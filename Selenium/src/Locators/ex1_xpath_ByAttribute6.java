package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_xpath_ByAttribute6 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		
		//Enter UN
		//driver.findElement(locator type)
		//driver.findElement(By.xpathExpression);
		
		//Enter username
		d.findElement(By.xpath("//input[@name='email']")).sendKeys("dsfdse wfdfc");
		
		//Enter password
		d.findElement(By.xpath("//input[@id='pass']")).sendKeys("dsafds@efdesf");
		
		//Login Button
		d.findElement(By.xpath("//button[@name='login']")).click();		
	}
}
