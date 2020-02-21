package driverScript;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import commonfunctionLibrary.FunctionLibrary;
import utilities.PropertyFileUtil;

public class Dummy {

	public static void main(String[] args) throws Exception {
//		System.out.println(PropertyFileUtil.getValueForKey("Url"));
//		System.out.println(PropertyFileUtil.getValueForKey("Browser"));
		ExtentReports report = new ExtentReports("C:\\Users\\srikanth.b\\Desktop\\myreport.html"); 
        System.out.println("execution started");
        ExtentTest writer = report.startTest("login test");
        WebDriver driver = FunctionLibrary.startBrowser();
        writer.log(LogStatus.INFO,"chrome opened");
        FunctionLibrary.openApplication(driver);
        
	}

}
