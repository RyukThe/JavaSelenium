package Scroll;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver m= new ChromeDriver();
		m.get("https://www.youtube.com/");
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		
		((JavascriptExecutor)m).executeScript("window.scrollBy(0,300000)");
		
		Thread.sleep(2000);
		((JavascriptExecutor)m).executeScript("window.scrollBy(0,-45412)");
		
	}

}
