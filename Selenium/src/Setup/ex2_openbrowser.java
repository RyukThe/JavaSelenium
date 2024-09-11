package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_openbrowser
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity testing notes\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		//create an object of chromedriver class with reference/datatype of superinterface(webdriver)
		
		WebDriver driver=new ChromeDriver();
	}
}
