package SamplesOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3_Get 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver",
		"D:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
	}
}
