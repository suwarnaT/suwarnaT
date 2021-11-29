package Demo.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class AppTest
{
	WebDriver driver;
	ExtentHtmlReporter reporter;
	ExtentReports extent;
	ExtentTest test;
	
   @Test
   public void test() throws Exception
  {
	    reporter=new ExtentHtmlReporter("./reports/" + "AdminModule.html");
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		reporter.config().setDocumentTitle("Automation Report");
		reporter.config().setReportName("Admin");
		
		String css = ".r-img {width: 50%;}";
	    reporter.config().setCSS(css);
	    test=extent.createTest("Admin Module ");
   	    test.createNode("TEST CASE NUMBER   "+"tc_01");
   	   test.info("Launch The  Web Site");
	   
	   WebDriver driver = null;
	  
	   driver=Browser_Launch.browser_launch("https://alpha.neutrino-ai.com/#/login",test);
	   
	   Login_User login=new Login_User(driver);
	   login.login_user("suwarna.jungari@neutrinotechlabs.com", "Suwarna@123",test);

	   
	   driver.quit();
	   extent.flush();
  }
}
