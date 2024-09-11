package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_closeMethod 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity testing notes\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://google.com/");
		
		driver.close();
		
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.linkedin.com/");
		driver1.close();
	}
}
