package Setup;

import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_OpenChromeBrowser
{
	public static void main(String[]args)
	{
		//Step1: set path of chromedriver.exe file
		//parameter1: name of the browser(small letters)
		//parameter2: path of the browser file
		
		System.setProperty("webdriver.chrome.driver", 
		"D:\\selenium\\chromedriver.exe");  //diffClassName.methodName();
		////System.setProperty("selenium flavorName.BrowserName.driver","copy chromedriver path browser file");
		
		//Step2: Create an object of ChromeDriver class
		ChromeDriver chrome= new ChromeDriver(); ///classname objname=new classname();
		
		
		
	}

}
