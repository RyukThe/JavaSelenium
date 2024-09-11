package SamplesOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample6_Click 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
		"D:\\selenium\\chromedriver.exe");                   
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.xpath("//span[text()='Sign up']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Log in with Facebook']")).click();
	}
}
