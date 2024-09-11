package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example7_Minimize 
{
	public static void main(String[]args)
	{
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\rushi\\Videos\\SOFTWARE TESTING CLASS\\SELENIUM TOOL\\chromedriver_win32\\chromedriver.exe");   
	
	
		WebDriver driver=new ChromeDriver();   
		
		driver.get("https://www.youtube.com/");
		
		driver.manage().window().minimize();  
		
//		Options s1 = driver.manage();
//		Window s2 = s1.window();
//		s2.minimize();

	
	}
}
