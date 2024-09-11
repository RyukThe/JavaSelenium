package AssignmentWingify;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Spliterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ClassTest1 
{
	
	@Test
		public void VerifyPrice() throws InterruptedException, IOException
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
			
			//1.before filter capture the prices
			
			m.findElement(By.xpath("(//table[@id='transactionsTable']//tr/th)[5]")).click();
			
//			String sa = m.findElement(By.xpath("(//table[@id='transactionsTable']//tr/th)[5]")).getText();
//			
//			System.out.println(sa);
			
			List<WebElement> values=new ArrayList<WebElement>();
			
			List<WebElement> values1= m.findElements(By.xpath("//tr/td[5]"));
			List<String> colm= new ArrayList<String>();
			System.out.println("------------------------------------------------------");
		for( WebElement mq: values1)
		{
			
			String sdd = mq.getText();
			System.out.println(sdd);
			colm.add(sdd);
		}
		
		System.out.println("---------------------------------------");
		
		
		for(int i=0;i<colm.size();i++)
		{
		 assertEquals(colm.get(i), UtilityClass.readDatafromPropertyFile("value"+i));
		}
		List<String> sortedClmV= new ArrayList<String>(colm);
		Collections.sort(sortedClmV);
		
		for(String sor:sortedClmV)
		{
			System.out.println(sor);
		}
	
		
	//Spliterator<String> sd = sortedClmV.spliterator();
	


		//assertTrue(colm.equals(sortedClmV));
		
		
}

	
	public static ArrayList<String> values(List<WebElement> values)
	{
		
		
		ArrayList<String> vaul= new ArrayList();
		for(WebElement text:values)
		{
			String valuesstr = text.getText();
			vaul.add(valuesstr);
			 
			
			
		}
		
		return vaul;
		
	}

}
