package PageObjectModel;

import org.testng.annotations.Test;

import Common.utility;

import org.testng.annotations.DataProvider;

public class Test_FaceBook extends utility {
  @Test(dataProvider = "dp")
  public void f(String userid, String userpass) throws InterruptedException {
	  FacebookHomePage obj= new  FacebookHomePage(driver);
	  obj.Enterusername(userid);
	  Thread.sleep(2000);
	  obj.Enterpassword(userpass);
	  Thread.sleep(2000);
	  obj.clicktocontinue();
	  Thread.sleep(2000);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "yohanes", "password" },
      new Object[] { "Bethy", "password2" },
      new Object[] { "merry", "password3" },
      new Object[] { "Gabriel", "password4" },
    };
  }
}
