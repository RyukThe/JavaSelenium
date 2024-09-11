package getOptions;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class18 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver n=new ChromeDriver();
		n.get("https://www.facebook.com/");
		n.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		WebElement n2 = n.findElement(By.xpath("//select[@id='month']"));
		
		Select s= new Select(n2);
		List<WebElement> s1 = s.getOptions();
		
		for(WebElement l:s1)
		{
			System.out.println(l.getText());
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println(s1.size());
		
	}

}
