package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6_tagname
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
		"D:\\selenium\\chromedriver.exe");  //diffClassName.methodName();	
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/rushi/Videos/SOFTWARE%20TESTING%20CLASS/HTML%20NOTEPAD/locator%20html/tagname.html");
		
		//enter FN
		driver.findElement(By.tagName("input")).sendKeys("abc");

		
		//enter LN
		driver.findElement(By.tagName("input")).sendKeys("xyz");

		
		
	}

}

