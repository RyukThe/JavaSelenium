package Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver m = new ChromeDriver();
		m.get("https://www.facebook.com");
		

		Thread.sleep(2000);
		
		WebElement AdChooise = m.findElement(By.xpath("//a[@class='_41ug']"));
		
		((JavascriptExecutor)m).executeScript("arguments[0].scrollIntoView();", AdChooise); // String, WebElement
		
	}

}