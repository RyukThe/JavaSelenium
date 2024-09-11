package webElements_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed_ex10 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.navigate().to("https://www.instagram.com/");
		
		boolean b=d.findElement(By.xpath("//div[@role='button']")).isDisplayed();
		System.out.println(b);
		
		if(b==true)
		{
			System.out.println("Element is found");
		}
		else
		{
			System.out.println("Element is not found");
		}
	}
}
