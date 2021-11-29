package Demo.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Locators 
{
	WebDriver driver;
	
	@FindBy (xpath="//*[text()='Email Id']//following::input[1]")
	public WebElement emailID;
	
	@FindBy (xpath="//*[text()='Email Id']//following::input[2]")
	public WebElement password;

	
}
