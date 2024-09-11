package Practice_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByContains_UsingText2_ex10 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity testing notes\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver s=new ChromeDriver();
		
		s.get("https://facebook.com/");
		
		//click on create new acc link
		
		s.findElement(By.xpath("//a[contains(text(),'New')]")).click();
		
		Thread.sleep(3000);
		s.close();
	}
}
