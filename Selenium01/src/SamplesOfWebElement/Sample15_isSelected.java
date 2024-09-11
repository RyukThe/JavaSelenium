package SamplesOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample15_isSelected
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com/");
				
				driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
				
				Thread.sleep(2000);
				
				boolean result = driver.findElement(By.xpath("(//input[@class='_8esa']) [2]")).isSelected();
				System.out.println(result);
				
				if(result==true)
				{
					System.out.println("Radio Button Is Properly Worked");
				}
				else
				{
					System.out.println("Radio Button Is Not Properly Worked");
				}
				driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();
				
				Thread.sleep(2000);
				
				boolean result1=driver.findElement(By.xpath("(//input[@class='_8esa']) [2]")).isSelected();
				System.out.println(result1);
				
				if (result1==true)
				{
					System.out.println("Radio Button Is Properly Worked");
				}
				else
				{
					System.out.println("Radio Button Is Not Properly Worked");
				}
	}
}
