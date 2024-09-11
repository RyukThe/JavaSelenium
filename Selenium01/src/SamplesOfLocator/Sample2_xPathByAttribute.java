package SamplesOfLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2_xPathByAttribute 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
		"D:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Karanja");
		
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Pune");
		
		
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		
		
		
		
	}
}
