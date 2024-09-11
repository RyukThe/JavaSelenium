package selenium_Mutiselectedeselect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example2_deSelectOption_fromMultiSelectableListbox1
{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/multiselectlistbox.html");
		
				
		WebElement selectCountry = driver.findElement(By.xpath("//select[@id='1234']"));
		Select s=new Select(selectCountry);
		
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(3);
		
		Thread.sleep(2000);
		
		s.deselectByVisibleText("Ind");
		s.deselectByIndex(3);
		
		
	}

}