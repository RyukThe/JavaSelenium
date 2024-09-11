package SamplesOfLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample13_xpathByContains_UsingText
{
	
		public static void main(String[] args)
		{
		System.setProperty("webdriver.chrome.driver",
		"D:\\selenium\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.zomato.com/");
				
				driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
	}
}
