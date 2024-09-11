package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_clear2
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
		"D:\\selenium\\chromedriver.exe");                  
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
			
	
		WebElement UN = driver.findElement(By.xpath("//input[@id='email']"));		
		UN.sendKeys("saurav");
		Thread.sleep(2000);
		UN.clear();
		Thread.sleep(2000);
		UN.sendKeys("xsdayz");

	}
}
