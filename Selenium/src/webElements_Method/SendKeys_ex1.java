package webElements_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_ex1
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		//enter username
		
		//d.findElement(By.xpath("//input[@id='email']")).sendKeys("abc123");
		
		WebElement UN=d.findElement(By.xpath("//input[@id='email']"));
		
		UN.sendKeys("abc");
	}
}
