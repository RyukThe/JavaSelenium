package SamplesOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample18_isSelected 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
		"D:\\selenium\\chromedriver.exe");
						
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.keynotesupport.com/internet/web-contact-form-example-radio-buttons.shtml");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Rushikesh Munde");
		
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9123456789");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("heyysin.32@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='radio']) [2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='radio']) [6]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//textarea[@name='comments']")).sendKeys("Hello sir");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
}
