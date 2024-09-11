package SamplesOfLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample11_xpathByContains_UsingText 
{
		public static void main(String[] args)
		{
		System.setProperty("webdriver.chrome.driver",
		"D:\\selenium\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com/");
				
				driver.findElement(By.xpath("//a[text()='Create a Page']")).click();
		}		
				
}
