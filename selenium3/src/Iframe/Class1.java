package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver m= new ChromeDriver();
		m.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		m.switchTo().frame(m.findElement(By.xpath("//iframe[@id='iframeResult']")));
		
		m.findElement(By.xpath("//button[contains(text(),'Click me t')]")).click();
		
		m.switchTo().defaultContent();
		m.findElement(By.xpath("//a[@id='menuButton']")).click();
		
	}

}
