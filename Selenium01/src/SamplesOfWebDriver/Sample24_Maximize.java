package SamplesOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample24_Maximize
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
		"https://www.youtube.com/");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		driver.manage().window().maximize();
		
		
		
	}
}
