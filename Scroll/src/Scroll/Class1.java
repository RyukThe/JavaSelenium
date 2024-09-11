package Scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//scroll down
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(2000);
		
		
		//scroll up 
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-300)");
		Thread.sleep(2000);
		
		//scroll right 
		((JavascriptExecutor)driver).executeScript("window.scrollBy(300,0)");
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(300,0)");
	}

}
