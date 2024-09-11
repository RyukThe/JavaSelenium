package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example11_PartiallinkText
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
		"D:\\selenium\\chromedriver.exe");                    
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/rushi/Videos/SOFTWARE%20TESTING%20CLASS/HTML%20NOTEPAD/locator%20html/LinkText_PartialLinkText.html");
		
		Thread.sleep(3000);
		
		//click on facebook link
		driver.findElement(By.partialLinkText("face")).click();
	}

}
