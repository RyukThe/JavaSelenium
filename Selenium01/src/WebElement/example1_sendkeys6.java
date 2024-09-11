package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_sendkeys6
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
		"D:\\selenium\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		

		
		WebElement UN = driver.findElement(By.xpath("//input[@type='text']"));
		UN.sendKeys("sadsadadadad");
	}

}
