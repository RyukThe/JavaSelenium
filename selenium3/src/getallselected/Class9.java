package getallselected;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class9 
{
	public static void main(String[] args)
	{
		WebDriver n=new ChromeDriver();
		
		n.get("file:///D:/multiselectlistbox.html");
		
		WebElement k = n.findElement(By.xpath("//select[@id='1234']"));
		
		Select s= new Select(k);
		
		s.selectByIndex(3);
		s.selectByIndex(2);
		s.selectByIndex(1);
		s.selectByIndex(0);
		
		System.out.println();
		
		System.out.println();
		List<WebElement> al = s.getAllSelectedOptions();
		
		for( WebElement a:al)
		{
			System.out.println(a.getText());
		}
		
		System.out.println();
		System.out.println(al.size());
		
	}

}
