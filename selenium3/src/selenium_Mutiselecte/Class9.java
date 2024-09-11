package selenium_Mutiselecte;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class9
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver n=new ChromeDriver();
		n.get("file:///D:/multiselectlistbox.html");
		Thread.sleep(2000);
		
		WebElement option = n.findElement(By.xpath("//select[@id='1234']"));
		
		Select d=new Select(option);
		d.selectByIndex(2);
		Thread.sleep(2000);
		d.selectByVisibleText("Ind");
		
		
	}

}
