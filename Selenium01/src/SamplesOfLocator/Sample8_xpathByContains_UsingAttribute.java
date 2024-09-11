package SamplesOfLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample8_xpathByContains_UsingAttribute
{
	public static void main(String[] args) 
	{
		
	
	System.setProperty("webdriver.chrome.driver",
			"D:\\selenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("Rushikesh Munde");
			
			driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("Rushi@123");
			
			driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}
}
	
