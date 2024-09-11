package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_xpath_ByAttribute
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity testing notes\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("priyankatakalkar18@gmail.com");
		
		//Enter password
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Chiku@123");
		
		//Login Button
		driver.findElement(By.xpath("//button[@name='login']")).click();		
		
//		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("priyankatakalkar18@gmail.com");
//		
//		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
	}
}
