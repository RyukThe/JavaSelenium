package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_HowToOpenBrowser
{
	public static void main(String[]args)
	{
		//step1: set path of chromedriver.exe file
	   //para1: name of the browser(small letters)
	  //para2: path of the browser file
		
		System.setProperty("webdriver.chrome.driver",
		"D:\\selenium\\chromedriver.exe");
		////System.setProperty("selenium flavorName.BrowserName.driver","copy chromedriver path browser file");
		
		//Create an object of ChromeDriver class with reference/datatype of super interface(WebDriver)
		WebDriver driver=new ChromeDriver();  ///classname objname=new classname();
	}
}
