package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class22
{
	public static void main(String[] args) 
	{
		WebDriver m=new ChromeDriver();
		m.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		m.switchTo().frame("iframeResult");
		m.findElement(By.xpath("//button[contains(text(),'Click me to')]")).click();
		m.switchTo().parentFrame();
		m.findElement(By.xpath("//a[@id='menuButton']")).click();
		
	}

}
