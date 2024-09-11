package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6_isDisplayed
{
	public static void main(String[] args)
	{	
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\rushi\\Videos\\SOFTWARE TESTING CLASS\\SELENIUM TOOL\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		boolean result = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		System.out.println(result);
		
		if(result==true)
		{
			System.out.println("Element found");
		}
		else
		{
			System.out.println("Element not found");
		}
	}
}
