package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example5_xpathByIndex
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
		"D:\\selenium\\chromedriver.exe"); 	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//click on create new acc link
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(3000);

		//enter FN
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("abc");
		
		//enter surname
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("xyz");
			
		//enter Mob num
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9999999999");
				
		
	}

}
