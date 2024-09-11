package SamplesOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample8_getText
{
	public static void main(String[] args)
		{
			System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\rushi\\Videos\\SOFTWARE TESTING CLASS\\SELENIUM TOOL\\chromedriver_win32\\chromedriver.exe");                    //diffClassName.methodName();	
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.instagram.com/");
			
//			driver.findElement(By.xpath("//span[text()='Log in with Facebook']")).getText();
			
			String text = driver.findElement(By.xpath("//span[text()='Log in with Facebook']")).getText();
			System.out.println(text);
			
		}
}
