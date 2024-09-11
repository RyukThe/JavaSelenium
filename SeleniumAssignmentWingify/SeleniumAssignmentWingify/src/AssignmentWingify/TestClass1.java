package AssignmentWingify;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass1
{
	@Test
	public void VerifyPrice() throws InterruptedException
	{
		WebDriver m=new ChromeDriver();
		m.get("https://sakshingp.github.io/assignment/login.html");
		Thread.sleep(2000);
		m.manage().window().maximize();
		//Thread.sleep(2000);
	
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		m.findElement(By.xpath("//input[@id='username']")).sendKeys("Wingify");
		m.findElement(By.xpath("//input[@id='password']")).sendKeys("123divya");
		m.findElement(By.xpath("//button[text()='Log In']")).click();
		
		m.findElement(By.xpath("(//table[@id='transactionsTable']//tr/th)[5]")).click();
		
		
		List<WebElement> values=new ArrayList<WebElement>();
		List<Integer> intcol= new ArrayList<Integer>();
		List<WebElement> values1= m.findElements(By.xpath("//tr/td[5]"));
		
		for(WebElement cellin:values1)
		{
			try {
				intcol.add(Integer.parseInt(cellin.getText()));
			}
			catch (Exception e)
			{
				
			}
		}
		
		for(Integer Beforesort:intcol)
		{
			System.out.println( Beforesort);
		}
		
		System.out.println("-------------------------------------------");
		
		Collections.sort(intcol);
		
		for(Integer aftersort:intcol)
		{
			Integer sa = aftersort;
			
		}
		System.out.println(intcol.size());
		
		for(int i=0;i<intcol.size();i++)
		{
			int expresult= intcol.get(i);
			int actr=Integer.parseInt(values1.get(i).getText());
			assertEquals(expresult, actr);
		}
	
	}
}
