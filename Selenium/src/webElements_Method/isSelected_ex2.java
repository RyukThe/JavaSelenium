package webElements_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected_ex2 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity testing notes\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		
		d.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(3000);
		
		boolean result=d.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected();
		System.out.println(result);
		
		if(result==true)
		{
			System.out.println("radio btn is selected");
		}
		else
		{
			System.out.println("radio btn is not selected");
		}
	}
}
