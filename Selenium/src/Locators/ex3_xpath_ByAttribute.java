package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3_xpath_ByAttribute 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.instagram.com/");
		
		//d.findElement(By.xpath("//a[@id='u_0_0_qN']")).click();
		
		d.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("sadawdsdad adsad");
		
		d.findElement(By.xpath("//input[@name='password']")).sendKeys("awedead@12wd223");
		
		d.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
