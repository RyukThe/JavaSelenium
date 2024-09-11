package SamplesOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample19_isSelected 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
		"D:\\selenium\\chromedriver.exe");
								
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.keynotesupport.com/internet/web-contact-form-example-radio-buttons.shtml");	

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Teajswini Swami");
		
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9123456789");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("tejaswini.swami@gmai.com");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='radio']) [4]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='radio']) [7]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//textarea[@name='comments']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		boolean result = driver.findElement(By.xpath("(//input[@type='radio']) [4]")).isSelected();
		System.out.println(result);
		
		if(result==true)
		{
			System.out.println("Element is worked");
		}
		else
		{
			System.out.println("element is not worked");
		}
		
	}
	
}
		
