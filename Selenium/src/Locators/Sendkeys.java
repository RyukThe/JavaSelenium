package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Sendkeys 
{
	//gmail wait 5 sec refresh id next wait 6sec minimize closeall 
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.navigate().to("https://accounts.google.com/");
		
		Thread.sleep(3000);
		
		d.navigate().refresh();
		
		d.findElement(By.xpath("//input[@name='identifier']")).sendKeys("sfdsfsfsfsfs8@gmail.com");
		d.findElement(By.xpath("//button[@class=\"VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b\"]")).click();
		
		Thread.sleep(6000);
		
		d.manage().window().minimize();
		
		d.quit();
	}
}
