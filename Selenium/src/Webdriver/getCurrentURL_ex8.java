package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentURL_ex8 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		
		System.out.println(title);
		System.out.println(url);
		
		driver.quit();
		
	}
}
