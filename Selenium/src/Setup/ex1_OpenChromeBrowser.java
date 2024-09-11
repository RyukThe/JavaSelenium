package Setup;

import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_OpenChromeBrowser
{
	public static void main(String[] args) 
	{
		//step1:set path of chormedeiver.exe file
		//parameter1:name of browser(small letter)
		//parameter2:path of browser file
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity testing notes\\selenium\\chromedriver_win32\\chromedriver.exe");		//diffclassname.methodname
	
	
		//step2:create an  object of chrome driver class
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_4qsiujpf5j_e&adgrpid=60456322738&hvpone=&hvptwo=&hvadid=486459496700&hvpos=&hvnetw=g&hvrand=6886776674673816009&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062111&hvtargid=kwd-360364908477&hydadcr=14451_2154369&gclid=EAIaIQobChMIp-b71JqN-wIViINLBR3mgQeCEAAYASAAEgJyMfD_BwE");
	}
}
