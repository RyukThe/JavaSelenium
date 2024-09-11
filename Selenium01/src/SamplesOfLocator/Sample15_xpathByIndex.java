package SamplesOfLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample15_xpathByIndex  
{
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver",
			"D:\\selenium\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.instagram.com/");
			
			driver.findElement(By.xpath("//span[text()='Sign up']")).click();
			
			Thread.sleep(1000);
			
			///enter MobNum&EmailAddress
			driver.findElement(By.xpath("(//input[@type='text']) [1]")).sendKeys("appu.vaidya007@gmail.com");
			
			//enter FullName
			driver.findElement(By.xpath("(//input[@type='text']) [2]")).sendKeys("Apporva Vaidya");
			
			//enter UserName
			driver.findElement(By.xpath("(//input[@type='text']) [3]")).sendKeys("angel.appu007");
			
			//enter Password
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Appu@123");
			
			//enter SignUp
			driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		}
		
}
