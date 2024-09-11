package SamplesOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample18_GetTitle
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
		"D:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ubisoft.com/en-us/");
		
		String Title=driver.getTitle();
		System.out.println(Title);
		Thread.sleep(4545);
		System.out.println(driver.getTitle());
	}
	}

