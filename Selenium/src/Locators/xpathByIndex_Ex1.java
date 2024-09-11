package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByIndex_Ex1 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https:www.facebook.com");
		
		d.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(3000);
		
		d.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("asxczxscxz");
		
		d.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("abc@123");
		
		d.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("ascscxzcxz");
		
		
	}
}
