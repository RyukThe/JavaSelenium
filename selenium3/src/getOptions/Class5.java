package getOptions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class5 
{
	public static void main(String[] args)
	{
		WebDriver n= new ChromeDriver();
		n.get("file:///D:/multiselectlistbox.html");
		WebElement s = n.findElement(By.xpath("//select[@id='1234']"));

		Select s1=new Select(s);
		List<WebElement> s2 = s1.getOptions();
		for( WebElement s3:s2)
		{
			System.out.println(s3.getText());
		}
		
		System.out.println();
		System.out.println(s2.size());
		
		
		
	}

}
