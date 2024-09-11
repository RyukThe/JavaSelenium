package AssignmentWingify;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
//		FileInputStream file=new FileInputStream("C:\\Users\\Sai\\Desktop\\Selenium\\sample1.xlsx");
//		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://sakshingp.github.io/assignment/login.html");
		//Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WingifyLoginPage login=new WingifyLoginPage(driver);
		
		login.inpWingifyLoginPageUN(UtilityClass.readDatafromPropertyFile("UN"));
		login.inpWingifyLoginPagePWD("pass");
		login.ClickWingifyLoginPagelofinbtn();
		
		Thread.sleep(2000);
		
		WingifyHomePage home=new WingifyHomePage(driver);
		home.ClickWingifyHomePageAmount();
		//driver.close();
	
	}

}
