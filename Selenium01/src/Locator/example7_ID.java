package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example7_ID
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
		"D:\\selenium\\chromedriver.exe");//diffClassName.methodName();	
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/rushi/Videos/SOFTWARE%20TESTING%20CLASS/HTML%20NOTEPAD/locator%20html/id.html");
		
		//enter FN
		driver.findElement(By.id("1234")).sendKeys("abc");
		
		//enter LN
		driver.findElement(By.id("1234")).sendKeys("xyz");	
	}

}
