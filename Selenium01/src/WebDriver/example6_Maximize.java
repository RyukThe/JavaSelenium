package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.execution.instrumentation.tracing.TracingInstrumentation.Options;

public class example6_Maximize 
{
	public static void main(String[]args)
	{
		//step1: set path of chromedriver.exe file
	    //para1: name of the browser(small letters)
		//para2: path of the browser file
		System.setProperty("webdriver.chrome.driver",
		"D:\\selenium\\chromedriver.exeD:\\selenium\\chromedriver.exe");
		
	
		WebDriver driver=new ChromeDriver();  
		
		driver.get("https://www.youtube.com/");  
		
		driver.manage().window().maximize();
		
//		Options s1 = driver.manage();
//		Window s2 = s1.window();
//		s2.maximize();	

	}
}
