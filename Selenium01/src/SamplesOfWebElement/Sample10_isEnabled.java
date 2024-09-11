package SamplesOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample10_isEnabled 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\rushi\\Videos\\SOFTWARE TESTING CLASS\\SELENIUM TOOL\\chromedriver_win32\\chromedriver.exe");                    //diffClassName.methodName();	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
//		driver.findElement(By.xpath("//span[text()='Log in with Facebook']")).isEnabled();
		boolean result = driver.findElement(By.xpath("//span[text()='Log in with Facebook']")).isEnabled();
		System.out.println(result);
		
		if(result==true)
		{
			System.out.println("Element is Enable");
		}
		else
		{
			System.out.println("Element is Disable");
		}
	}
}
