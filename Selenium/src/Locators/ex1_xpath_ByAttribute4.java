package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_xpath_ByAttribute4 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		
	
		d.findElement(By.xpath("//input[@name='email']")).sendKeys("sadsdqw dfsfxcv");
		
		//Enter password
		d.findElement(By.xpath("//input[@id='pass']")).sendKeys("sdadawddcsa@123");
		
		//Login Button
		d.findElement(By.xpath("//button[@name='login']")).click();		
	}
}
