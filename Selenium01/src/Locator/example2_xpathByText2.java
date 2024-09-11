package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_xpathByText2
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
		"D:\\selenium\\chromedriver.exe");                    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//click on Create new acc link
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
	}

}