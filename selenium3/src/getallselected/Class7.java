package getallselected;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class7 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver n= new ChromeDriver();
		n.get("file:///D:/multiselectlistbox.html");
	WebElement d=	n.findElement(By.xpath("//select[@id='1234']"));
	
	
	Select s= new Select(d);
	s.selectByIndex(2);
	Thread.sleep(500);
	s.selectByIndex(3);
	Thread.sleep(500);
	s.selectByIndex(0);
	
	
	WebElement text = s.getFirstSelectedOption();
		System.out.println("First selected option = "+text.getText());
		
		List<WebElement> textall = s.getAllSelectedOptions();
		
		for( WebElement allselected: textall)
		{
			System.out.println(allselected.getText());
		}
		
		
		System.out.println();
		
		System.out.println("all slected Options"+ "--"+textall.size());
		
		
	
		
	}

}
