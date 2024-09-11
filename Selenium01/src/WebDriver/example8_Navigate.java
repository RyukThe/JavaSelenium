package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example8_Navigate 
{
	public static void main( String[]args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver",
		"D:\\selenium\\chromedriver.exe");  
		WebDriver driver =new ChromeDriver(); 
		
		driver.navigate().to("https://monkeytype.com/");  
		Thread.sleep(6000);
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(6000);
		driver.navigate().forward();
		Thread.sleep(6000);
		driver.navigate().refresh();
		Thread.sleep(2000);

	}
}
