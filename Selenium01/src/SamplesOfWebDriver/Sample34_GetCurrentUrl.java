package SamplesOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample34_GetCurrentUrl 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
		"D:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\selenium\\chromedriver.exe");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(driver.getCurrentUrl());
	}
}
