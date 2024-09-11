package Scroll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class6 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver m = new ChromeDriver();
		m.get("https://www.amazon.in/");
		
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement cond = m.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
		Thread.sleep(2000);
		
		
		((JavascriptExecutor)m).executeScript("arguments[0].scrollIntoView();", cond);
		
		
	}

}
