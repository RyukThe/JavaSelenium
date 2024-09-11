package Practice_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathby_contains_usingtext1_ex9 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity testing notes\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver n=new ChromeDriver();
		
		n.get("https://facebook.com/");
		n.findElement(By.xpath("//a[contains(text(),'password')]")).click();
		
		n.close();
	}
}
