package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample9_xpathByContains_UsingAttribute
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver",
	"D:\\selenium\\chromedriver.exe");
			
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	
	driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("Rushikesh Munde");
	
	driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("Rushi@123");
	
	driver.findElement(By.xpath("//div[text()='Log in']")).click();
	}		
			
}
