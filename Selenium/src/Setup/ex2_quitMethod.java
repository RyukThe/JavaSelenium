package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_quitMethod
{
	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity testing notes\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com/");
		
		driver.quit();
	}
}
