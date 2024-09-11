package getOptions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver op=new ChromeDriver();
		op.get("https://www.facebook.com/");
		op.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		WebElement n = op.findElement(By.xpath("//select[@id='month']"));
		
		Select s= new Select(n);
		List<WebElement> allop = s.getOptions();
		
		System.out.println();
		
		for(WebElement w:allop)
		{
			System.out.println(w.getText());
		}
		System.out.println();
		
		System.out.println(allop.size());
	}

}
