package SamplesOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4_clear 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
		"D:\\selenium\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
			
		
		WebElement PWD = driver.findElement(By.xpath("//input[@id='pass']"));
		PWD.sendKeys("Pass@123");
		Thread.sleep(2000);
		PWD.clear();
		Thread.sleep(2000);
		PWD.sendKeys("hfshg3");
	
	}
}
