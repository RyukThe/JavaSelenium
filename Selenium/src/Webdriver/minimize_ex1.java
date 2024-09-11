package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;



public class minimize_ex1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity testing notes\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.meesho.com/");
		
		Thread.sleep(4000);
		
		driver.manage().window().minimize();
		
//		Options s1=driver.manage();
//		Window s2=s1.window();
//		s2.minimize();
	}
}
