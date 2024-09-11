package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4_xpathByContains_UsingAttribute2
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
		"D:\\selenium\\chromedriver.exe");                    //diffClassName.methodName();	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("Roshan");
		
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("Pass@123");
		
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
	
		
	}
}
