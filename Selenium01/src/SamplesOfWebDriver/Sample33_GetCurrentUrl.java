package SamplesOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample33_GetCurrentUrl
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
		"D:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ubisoft.com/en-us/");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(driver.getCurrentUrl());
	}
}
