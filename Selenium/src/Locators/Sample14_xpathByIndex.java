package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample14_xpathByIndex 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
		"D:\\selenium\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//click on create new acc link
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(2000);
		
		///enter FirstName 
		driver.findElement(By.xpath("(//input[@type='text']) [2]")).sendKeys("Rushi");
	
		///enter LastName
		driver.findElement(By.xpath("(//input[@type='text']) [3]")).sendKeys("Munde");
		
		///enter MobileNumber
		driver.findElement(By.xpath("(//input[@type='text']) [4]")).sendKeys("9177777898");
		
		///enter NewPassword
		driver.findElement(By.xpath("(//input[@type='password']) [2]")).sendKeys("Rushi@123");
		
		
		driver.findElement(By.xpath("//select[@id='day']")).sendKeys("12");
		
		
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Jun");
		
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1997");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	
	}
}
