package AssignmentWingify;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass
{
	WebDriver driver;


	public void initializeBrowser() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://sakshingp.github.io/assignment/login.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//Thread.sleep(2000);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}


}
