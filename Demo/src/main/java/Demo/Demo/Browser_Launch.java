package Demo.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

public class Browser_Launch 
{
	
	 static WebDriver driver;
	
	  public Browser_Launch(WebDriver driver)
	  {
		  this.driver=driver;
	  }
	  
	  
	  public static WebDriver browser_launch(String url,ExtentTest test) throws Exception
	  {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Jars\\chromedriver.exe");
		  
		  driver=new ChromeDriver();
		  
		  driver.get(url);
		  
		  driver.manage().window().maximize();
		  
		  String path=Screenshot_Capture.screenshot_captured(driver, "Home_Page");
		  
		  test.pass("Home_Page", MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		  Thread.sleep(5000);
		  
		  return driver;
		  
	  }

}
