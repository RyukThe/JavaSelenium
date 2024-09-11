package SamplesOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2_sendkeys
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
		"D:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		
		
		WebElement UN = driver.findElement(By.xpath("//input[@type='text']"));
		
		UN.sendKeys("Roshan");
		
		
	}
}
