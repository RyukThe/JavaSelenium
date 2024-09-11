package SamplesOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample9_isEnabled2
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
		"D:\\selenium\\chromedriver.exe");                   
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		

		
		boolean result = driver.findElement(By.xpath("//button[text()='Log in']")).isEnabled();
		System.out.println(result);
		if(result==true)
		{
			System.out.println("Element is enable");
		}
		else
		{
			System.out.println("Element is disable");
		}	
	}
}
