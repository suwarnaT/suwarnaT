package Demo.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

public class Login_User
{
	 WebDriver driver;
	
		
	
	 public Login_User(WebDriver driver)
	 { 
		 this.driver=driver; 
		 PageFactory.initElements(driver, this);
	 }
	
	 
  public  void login_user(String emailID,String pass,ExtentTest test) throws Exception
  {	  
	  test.info("Enter the Username and Password");
	  System.out.println("Hi......");
	  Locators loc=PageFactory.initElements(driver, Locators.class);
	  loc.emailID.sendKeys(emailID);
	  loc.password.sendKeys(pass);
	  
	  String path=Screenshot_Capture.screenshot_captured(driver, "Login_Page");
	  test.pass("Login_Page", MediaEntityBuilder.createScreenCaptureFromPath(path).build());
	  Thread.sleep(5000);
	 
  }

}
