package webElements_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW_question3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity testing notes\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		
		d.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(3000);
		
		WebElement wn=d.findElement(By.xpath("(//input[@type='radio'])[2]"));
		
		boolean b=wn.isSelected();
		
		System.out.println(b);
		if(b==true)
		{
			System.out.println("male radio btn is selected");
		}
		else
		{
			System.out.println("male radio btn is not selected");
		}
		
		wn.click();
		
		boolean b1=wn.isSelected();
		System.out.println(b1);
		if(b1==true)
		{
			System.out.println("male radio btn is selected");
		}
		else
		{
			System.out.println("male radio btn is not selected");
		}
		
	}
	
	
}
