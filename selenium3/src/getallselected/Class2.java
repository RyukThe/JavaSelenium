package getallselected;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class2 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver n= new ChromeDriver();
		n.get("file:///D:/multiselectlistbox.html");
		WebElement T = n.findElement(By.xpath("//select[@id='1234']"));
		
		Select s= new Select(T);
		
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(3);
		
		List<WebElement> se = s.getAllSelectedOptions();
		
		for(WebElement ss:se)
		{
			System.out.println(ss.getText());
			
		}
		
		System.out.println();
		
		System.out.println("Selected Option Size: " + se.size());
		
	}

}
