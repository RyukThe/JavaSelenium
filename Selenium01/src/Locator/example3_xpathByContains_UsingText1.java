package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_xpathByContains_UsingText1
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
		"D:\\selenium\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//click on forgotten pwd link
		driver.findElement(By.xpath("//a[contains(text(),'password')]")).click();
		
	}

}
