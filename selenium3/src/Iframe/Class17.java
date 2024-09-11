package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class17
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver k = new ChromeDriver();
		k.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		k.switchTo().frame("iframeResult");
		k.findElement(By.xpath("//button[contains(text(),'Click me t')]")).click();
		k.switchTo().defaultContent();
		k.findElement(By.xpath("//a[@id='menuButton']")).click();
	}

}
