package Scroll;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class9
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver m= new ChromeDriver();
		m.get("https://www.planetsuperheroes.com/");
		
		m.manage().window().fullscreen();
		
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		((JavascriptExecutor)m).executeScript("window.scrollBy(5000,0)");
		Thread.sleep(2000);
		((JavascriptExecutor)m).executeScript("window.scrollBy(-5000,0)");
		Thread.sleep(2000);
		((JavascriptExecutor)m).executeScript("window.scrollBy(0,5000)");
		Thread.sleep(2000);
		((JavascriptExecutor)m).executeScript("window.scrollBy(0,-4578)");
		m.close();
	}

}
