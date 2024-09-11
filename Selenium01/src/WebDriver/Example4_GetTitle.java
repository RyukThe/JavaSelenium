package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_GetTitle 
{
	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.chrome.driver", 
		"D:\\selenium\\chromedriver.exe");     
		WebDriver driver=new ChromeDriver();  
		
		driver.get("https://www.youtube.com/");  
		
		
		String title=driver.getTitle();  
		System.out.println(driver.getTitle());   
		
	

		
	}
}
