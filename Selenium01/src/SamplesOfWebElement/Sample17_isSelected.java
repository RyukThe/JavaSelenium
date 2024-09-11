package SamplesOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample17_isSelected 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
		"D:\\selenium\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@class='_8esa']) [2]")).click();
		
		boolean result = driver.findElement(By.xpath("(//input[@class='_8esa']) [2]")).isSelected();
		System.out.println(result);
		if (result==true)
		{
			System.out.println("RADIO BUTTON WORKS PROPERLY");
		}
		else
		{
			System.out.println("RADIO BUTTON DOESN'T WORKS PROPERLY");
		}
	}
		
}
