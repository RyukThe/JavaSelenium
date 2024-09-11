package AssignmentWingify;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WingifyLoginPage
{
	@FindBy(xpath="//input[@id='username']") private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement PWD;
	@FindBy(xpath="//button[text()='Log In']") private WebElement login;
	 public WingifyLoginPage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
		 
	 }

	 public void inpWingifyLoginPageUN(String UNvalue)
	 {
		UN.sendKeys(UNvalue);
	 }
	 public void inpWingifyLoginPagePWD(String Password)
	 {
		PWD.sendKeys(Password);
	 }
	 public void ClickWingifyLoginPagelofinbtn()
	 {
		 login.click();
	 }


}
