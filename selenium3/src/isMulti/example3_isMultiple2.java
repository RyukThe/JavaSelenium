package isMulti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example3_isMultiple2
{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/multiselectlistbox.html");
		
		WebElement selectCountry = driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s=new Select(selectCountry);
		
		boolean result = s.isMultiple();
		System.out.println(result);
		
		if (result==true) 
		{
			System.out.println("Listbox is of multi-selectable ");
		}
		else
		{
			System.out.println("Listbox is of single-selectable ");
		}
		
	}

}