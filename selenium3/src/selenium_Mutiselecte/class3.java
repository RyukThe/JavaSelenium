package selenium_Mutiselecte;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class class3
{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/multiselectlistbox.html");
		
				
	
		WebElement selectCountry = driver.findElement(By.xpath("//select[@id='1234']"));
	
		Select s=new Select(selectCountry);
		
		
		s.selectByVisibleText("Ind");
		Thread.sleep(2000);
		s.selectByIndex(3);
		
		
	}

}