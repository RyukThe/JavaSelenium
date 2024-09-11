package SamplesOfLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sample1_xPathByAttribute 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
		"D:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("asdadaasd");
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Rushi@123");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}
