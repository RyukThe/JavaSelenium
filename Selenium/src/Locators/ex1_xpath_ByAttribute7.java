package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_xpath_ByAttribute7 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		
		
	
		d.findElement(By.xpath("//input[@name='email']")).sendKeys("esfdse re");
		
	
		d.findElement(By.xpath("//input[@id='pass']")).sendKeys("sfsdf@fsde");
		
		
		d.findElement(By.xpath("//button[@name='login']")).click();		
	}
}
