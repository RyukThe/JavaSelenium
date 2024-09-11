package getFirstSelectedOption;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class17
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver m=new ChromeDriver();
		m.get("file:///D:/multiselectlistbox.html");
		
		WebElement d = m.findElement(By.xpath("//select[@id='1234']"));
		Thread.sleep(2000);
		
		Select l= new Select(d);
		
		l.selectByIndex(0);
		l.selectByIndex(2);
		l.selectByIndex(3);
		Thread.sleep(2000);
		WebElement op = l.getFirstSelectedOption();
		String text = op.getText();
		System.out.println(text);
	}
}
