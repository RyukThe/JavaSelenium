package isMulti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver n= new ChromeDriver();
		n.get("https://www.facebook.com/");
		
		n.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(4555);
		WebElement m = n.findElement(By.xpath("//select[@id='month']"));
		
		Select s=new Select(m);
		boolean result = s.isMultiple();
		
		System.out.println(result);
		if(result==true)
		{
			System.out.println("multi selected list box");
		}
		else
		{
			System.out.println("Single selected list box");
		}
		
	}

}
