package Scroll;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class8 
{
	public static void main(String[] args)
	{
		WebDriver m= new ChromeDriver();
		m.get("https://www.planetsuperheroes.com/");
		
		m.manage().window().fullscreen();
		
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		((JavascriptExecutor)m).executeScript("window.scrollBy(0,300000)");
		
		m.close();
		
	}

}
