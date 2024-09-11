package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_sendkeys5
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
		"D:\\selenium\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		

		
		WebElement UN = driver.findElement(By.xpath("//input[@id='email']"));
		UN.sendKeys("sadsadadadad");
	}

}
