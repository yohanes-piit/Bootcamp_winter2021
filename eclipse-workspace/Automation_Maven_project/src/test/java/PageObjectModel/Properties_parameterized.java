package PageObjectModel;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import Common.utility;

public class Properties_parameterized extends utility {
  @Test
  public void f() throws IOException, InterruptedException {
	  Nopecommerce nop= new  Nopecommerce(driver);
	  Properties pro= new Properties();
	  FileInputStream sd= new  FileInputStream("C:\\Users\\mmyoh\\eclipse-workspace\\Automation_Maven_project\\target\\adhoc.properties");
  pro.load(sd);
  String email= pro.getProperty("Email");
  String password= pro.getProperty("password");
  Thread.sleep(2000);
  nop.setupuser(email);
  Thread.sleep(2000);
  nop.setuppass(password);
  Thread.sleep(2000);
  
  }
}
