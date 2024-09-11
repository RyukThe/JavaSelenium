package webElements_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear_ex1
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity testing notes\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		
//		d.findElement(By.xpath("//input[@id='email']")).sendKeys("priya@123");
//		Thread.sleep(3000);
//		d.findElement(By.xpath("//input[@id='email']")).clear();
//		Thread.sleep(3000);
//		d.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz123");
//		Thread.sleep(3000);
		
		WebElement UN=d.findElement(By.xpath("//input[@id='email']"));
		
		UN.sendKeys("abc");
		Thread.sleep(3000);
		UN.clear();
		Thread.sleep(3000);
		UN.sendKeys("xyz");
		
	}
}
