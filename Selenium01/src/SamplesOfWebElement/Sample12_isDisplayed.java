package SamplesOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample12_isDisplayed 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
		"D:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		boolean result = driver.findElement(By.xpath("//i[@data-visualcompletion='css-img']")).isDisplayed();
		System.out.println(result);
		
		if(result==true)
		{
			System.out.println("Element is shown");
		}
		else
		{
			System.out.println("Element is not shown");
		}
		
	}
}
