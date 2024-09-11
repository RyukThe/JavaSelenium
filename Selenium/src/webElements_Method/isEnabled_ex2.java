package webElements_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled_ex2
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity testing notes\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.instagram.com/");
		
		Thread.sleep(3000);
		
		boolean b=d.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		
		System.out.println(b);
		
		if(b==true) 
		{
			System.out.println("btn is enabled");
		}
		else
		{
			System.out.println("btn is disabled");
		}
	}
}
