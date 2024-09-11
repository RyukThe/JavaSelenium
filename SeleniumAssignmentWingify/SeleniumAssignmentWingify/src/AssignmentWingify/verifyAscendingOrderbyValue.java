package AssignmentWingify;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyAscendingOrderbyValue
{
@Test
	public void VerifyPrice() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://sakshingp.github.io/assignment/login.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//Thread.sleep(2000);
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Wingify");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123divya");
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		
		//1.before filter capture the prices
		
		List <WebElement> beforefilter = driver.findElements(By.className("text-danger"));
		
		//2.remove the dollar symbol from the price and remove
		
		List<Double> listprice=new ArrayList<>();
		
		for(WebElement s1:beforefilter)
		{	
			listprice.add(Double.valueOf(s1.getText().replace("$","")));
		}
		
		//3.filter the price low to high
		
		Select dropdown=new Select(driver.findElement(By.className("text-right")));
		dropdown.selectByVisibleText("Price(high to low)");
		
		
		//4.after filter capture values
		List <WebElement> afterFilterprice=driver.findElements(By.className("text-danger"));
		//5.remove the dollar symbol from the price and remove

		List<Double> afterFilterPriceList=new ArrayList<>();
		for(WebElement s1:afterFilterprice)
		{	
			afterFilterPriceList.add(Double.valueOf(s1.getText().replace("USD","")));
		}
		
		//6.compare the values /all assert the value(BEfore filter
		Collections.sort(listprice); //asc order
		Collections.reverse(listprice);//des order
		
		Assert.assertEquals(beforefilter, afterFilterPriceList);
		Thread.sleep(2000);
		driver.quit();
		
	}

}
