package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class21 
{
	public static void main(String[] args) 
	{
		WebDriver n =new ChromeDriver();
		n.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		n.switchTo().frame("iframeResult");
		n.findElement(By.xpath("//button[contains(text(),'Click me to ')]")).click();
		n.switchTo().defaultContent();
		n.findElement(By.xpath("(//a[@style='margin-top:-2px;'])[5]")).click();
	}

}
