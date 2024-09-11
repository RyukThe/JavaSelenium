package SamplesOfLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3_xPathByAttribute
{
	public static void main(String[] args)
	{
			System.setProperty("webdriver.chrome.driver",
			"D:\\selenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			
			driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9049242472");
			
			driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("rushi@123");
			
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();	
	
	}
}