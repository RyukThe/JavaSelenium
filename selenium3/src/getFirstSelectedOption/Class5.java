package getFirstSelectedOption;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class5
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver n= new ChromeDriver();
		n.get("https://www.facebook.com/");
		Thread.sleep(2000);
		n.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		
		WebElement m = n.findElement(By.xpath("//select[@id='month']"));
		
		Select s=new Select(m);
		WebElement op = s.getFirstSelectedOption();
		Thread.sleep(2000);
		String text = op.getText();
		System.out.println(text);
		System.out.println();
	}

}
