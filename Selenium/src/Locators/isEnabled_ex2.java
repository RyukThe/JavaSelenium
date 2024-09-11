package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled_ex2 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		
		boolean result=d.findElement(By.xpath("//button[text()='Log in']")).isEnabled();
		
		System.out.println(result);
		
		if(result==true)
		{
			System.out.println("Element  is enabled");
		}
		else
		{
			System.out.println("Element  is disabled");
		}
	}
}
