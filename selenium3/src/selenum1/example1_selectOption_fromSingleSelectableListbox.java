package selenum1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example1_selectOption_fromSingleSelectableListbox
{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//click on create new acc link
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(2000);
		
		//step1:
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		//step2:
		Select s=new Select(month);
		
		//step3:
		//s.selectByVisibleText("Jun");    //String text
		//s.selectByValue("12");              //String value 
		s.selectByIndex(5);              //int index
		
	}

}