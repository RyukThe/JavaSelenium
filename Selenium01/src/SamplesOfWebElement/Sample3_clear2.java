package SamplesOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3_clear2
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
		"D:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		

		
		
		WebElement UN = driver.findElement(By.xpath("//input[@type='text']"));
		UN.sendKeys("saurav");
		Thread.sleep(3000);
		UN.clear();
		Thread.sleep(3000);
		UN.sendKeys("Rushikesh");
	}
}
