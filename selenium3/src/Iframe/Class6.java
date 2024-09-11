package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class6 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver l = new ChromeDriver();
		l.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		l.switchTo().frame("iframeResult");
		l.findElement(By.xpath("//button[contains(text(),'Click me t')]")).click();
		l.switchTo().parentFrame();
		l.findElement(By.xpath("//a[@id='menuButton']")).click();
		
	}

}
