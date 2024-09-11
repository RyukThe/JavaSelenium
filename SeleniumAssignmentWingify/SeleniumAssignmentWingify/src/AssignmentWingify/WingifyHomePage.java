package AssignmentWingify;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WingifyHomePage
{
	@FindBy(xpath="//th[@id='amount']") private WebElement Amount;
	 
	public WingifyHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public boolean ClickWingifyHomePageAmount()
	{
		Amount.click();
		boolean result = Amount.isDisplayed();
		return  result;
	}

}
