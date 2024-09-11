package Scroll;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class7
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver m = new ChromeDriver();
		m.get("https://www.amazon.in/");
		
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(21));
		
		Thread.sleep(2000);
		
		((JavascriptExecutor)m).executeScript("window.scrollBy(0,47841)");
		
		Thread.sleep(2000);
		((JavascriptExecutor)m).executeScript("window.scrollBy(0,-4545)");
		WebDriverWait wait= new WebDriverWait(m, Duration.ofSeconds(10));
		
	}

}
