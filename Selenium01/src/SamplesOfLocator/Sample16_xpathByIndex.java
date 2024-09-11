package SamplesOfLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample16_xpathByIndex
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
		"D:\\selenium\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("");
	}
}
