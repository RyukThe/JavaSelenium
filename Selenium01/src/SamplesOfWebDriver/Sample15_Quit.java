package SamplesOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample15_Quit 
{
public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
		"D:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.close();
	}
}

