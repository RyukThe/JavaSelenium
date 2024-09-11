package SamplesOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample27_Minimize
{
	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver",
		"https://www.ubisoft.com/en-us/");
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		driver.manage().window().minimize();
	}
}
