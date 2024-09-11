package New_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1
{
	//facebook thrn click on help center then gettext privacy check facebook logo present 
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d=new ChromeDriver();
		
		d.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		d.findElement(By.xpath("//a[text()='Help']")).click();
		
		String s=d.findElement(By.xpath("(//span[text()='Privacy and security'])[1]")).getText();
		
		System.out.println(s);
		
		boolean b=d.findElement(By.xpath("(//div[@class='x9f619 x1n2onr6 x1ja2u2z x78zum5 xdt5ytf x2lah0s x193iq5w xeuugli'])[2]")).isDisplayed();
		
		System.out.println(b);
		if(b==true)
		{
			System.out.println("logo is present");
		}
		else
		{
			System.out.println("logo is not present");
		}
	}
}
