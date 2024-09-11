package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example5_GetCurrentURL 
{
	public static void main(String[]args)
	{
		//step1: set path of chromedriver.exe file
	    //para1: name of the browser(small letters)
		//para2: path of the browser file
		System.setProperty("webdriver.chrome.driver",
		"D:\\selenium\\chromedriver.exe");   
		WebDriver driver=new ChromeDriver();    
		
		driver.get("https://www.youtube.com/");
		
		String url=driver.getCurrentUrl();   
		System.out.println(url);              
		
		System.out.println(driver.getCurrentUrl()); 
		
	}
}
