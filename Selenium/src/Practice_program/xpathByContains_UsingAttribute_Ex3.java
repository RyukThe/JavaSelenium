package Practice_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByContains_UsingAttribute_Ex3
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity testing notes\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://facebook.com/");
		d.findElement(By.xpath("//input[contains(@placeholder,'phone number')]")).sendKeys("ppppp");
		
		
		d.findElement(By.xpath("//input[contains(@class,'6luy _9npi')]")).sendKeys("123eds");
				
		
		d.findElement(By.xpath("//button[contains(@class,'4jy6 _4jy1')]")).click();

	}
}
