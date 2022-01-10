package PageObjectModel;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Common.utility;

public class Listners extends utility implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("This is my first ilistner");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	 this.driver=((utility)result.getInstance()).driver;
			  String local=System.getProperty("user.dir");
			  System.out.println(local);
			  Date dt= new Date();
			  System.out.println(dt);
			  String td= dt.toString().replace(" ", "_").replace(":", "_");
			File stored=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileHandler.copy(stored,new File(local + "\\pictures\\passed\\"+td+"shots.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		  
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		this.driver=((utility)result.getInstance()).driver;
			  String local=System.getProperty("user.dir");
			  System.out.println(local);
			  Date dt= new Date();
			  System.out.println(dt);
			  String td= dt.toString().replace(" ", "_").replace(":", "_");
			File stored=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileHandler.copy(stored,new File(local + "\\pictures\\Failed"+td+"shots.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		  
		
		
	}
	
	
	

}
