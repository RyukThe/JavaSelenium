package SamplesOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample7_getText2
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
		"D:\\selenium\\chromedriver.exe");                  
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		

		
		String text = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText();
		System.out.println(text);
		
	}
}
