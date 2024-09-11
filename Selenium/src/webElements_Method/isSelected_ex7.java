package webElements_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected_ex7 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		
		d.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(1000);
		
		boolean b=d.findElement(By.xpath("//input[@value='-1']")).isSelected();
		System.out.println(b);
		
		if(b==true)
		{
			System.out.println("custom gender is selected");
		}
		else
		{
			System.out.println("custom gender is not selected");
		}
		
		d.close();
	}
}
