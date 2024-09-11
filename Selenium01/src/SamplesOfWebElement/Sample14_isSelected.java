package SamplesOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample14_isSelected
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com/");
				
				driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
				
				Thread.sleep(2000);
				
				boolean result = driver.findElement(By.xpath("//input[@class='_8esa']")).isSelected();
				System.out.println(result);
				
				if(result==true)
				{
					System.out.println("radio btn is worked");
				}
				else
				{
					System.out.println("radio btn is not worked");
				}
				
				
	}
}
