package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample16_xpathByIndex
{
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("ssada");
		
		//driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("zxxz");
		
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("sdsxzc");
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("sadxzczxz");
		
		Thread.sleep(2000);
		
		driver.close();
		
	}
}
