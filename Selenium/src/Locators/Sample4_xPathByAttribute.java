package Locators;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		
		public class Sample4_xPathByAttribute 
		{

		public static void main(String[] args) 
			{
				System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.instagram.com/");
				
				driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Roshu");
				
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rushilgr");
				
				
				driver.findElement(By.xpath("//button[@class='_acan _acap _acas']")).click();
				
				
				
			}

		}
