package selenium_Mutiselectedeselect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class10 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver n= new ChromeDriver();
		n.get("file:///D:/multiselectlistbox.html");
		WebElement op = n.findElement(By.xpath("//select[@id='1234']"));
		
		Select m=new Select(op);
		m.selectByIndex(1);
		m.selectByIndex(2);
		m.selectByIndex(3);
		Thread.sleep(2000);
		
		m.deselectByIndex(1);
		
		
	}

}
