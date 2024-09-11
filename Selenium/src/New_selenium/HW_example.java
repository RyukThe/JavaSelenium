package New_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW_example
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		
		d.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(3000);
		
		boolean result=d.findElement(By.xpath("(//input[@name='sex'])[1]")).isSelected();
		
		System.out.println(result);
		
		if(result==true)
		{
			System.out.println("radio btn is selected");
		}
		else
		{
			System.out.println("radio btn is not selected");
		}
		
		d.findElement(By.xpath("(//input[@class='_8esa'])[1]")).click();
		
		boolean s=d.findElement(By.xpath("(//input[@name='sex'])[1]")).isSelected();
		
		System.out.println(s);
		
		if(s==true)
		{
			System.out.println("female radio btn is selected");
		}
		else
		{
			System.out.println("female radio btn is not selected");
		}
	}
}
