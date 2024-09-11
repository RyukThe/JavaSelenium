package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Objects;

public class maximize_ex4 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity testing notes\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.icicibank.com/");
		
		//driver.manage().window().maximize();
		
		Options s1=driver.manage();
		Window s2=s1.window();
		s2.maximize();
	}
}
