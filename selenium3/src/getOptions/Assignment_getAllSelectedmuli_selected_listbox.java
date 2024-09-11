package getOptions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_getAllSelectedmuli_selected_listbox
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver n= new ChromeDriver();
		n.get("https://www.facebook.com/");
		n.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		
		WebElement n1 = n.findElement(By.xpath("//select[@id='month']"));
		
		Select s= new Select(n1);
		List<WebElement> text = s.getOptions();
		System.out.println();
		for( WebElement t:text)
		{
			System.out.println(t.getText());
		}
		System.out.println();
		System.out.println("Size : "+text.size());
	}

}
