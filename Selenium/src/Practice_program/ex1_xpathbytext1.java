package Practice_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_xpathbytext1 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.get("https://facebook.com/");
		//click on forgotten pwd link
		d.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	}
}
