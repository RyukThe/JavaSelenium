package Scroll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class5 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver m = new ChromeDriver();
		m.get("https://www.flipkart.com/");
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		
		m.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		WebElement gc = m.findElement(By.xpath("//span[text()='Gift Cards']"));
		
		Thread.sleep(2000);
		((JavascriptExecutor)m).executeScript("arguments[0].scrollIntoView();",gc);
		
		Thread.sleep(2000);
		
		WebElement flight = m.findElement(By.xpath("//div[text()='Flights']"));
		Thread.sleep(2000);
		((JavascriptExecutor)m).executeScript("arguments[0].scrollIntoView();",flight);
		
		
		for(int i=1;i<=500;i++)
		{
			((JavascriptExecutor)m).executeScript("arguments[0].scrollIntoView();",gc);
			
			Thread.sleep(1000);
			((JavascriptExecutor)m).executeScript("arguments[0].scrollIntoView();",flight);
		}
		
	}

}
