package FBtest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import FacebookBase.FBbase;
import FacebookUtility.FButility;
import pomfacebook.Facebookhomepage;
import pomfacebook.Facebookloginpage;

public class FBtest1 extends FBbase {
	Facebookloginpage login;
	 Facebookhomepage home;

	@BeforeClass
	public void openbrowser() {
		initializebrowser();
	 login=new Facebookloginpage(driver);
	home=new Facebookhomepage(driver);
	}
	 @BeforeMethod
	 public void openapplication() throws Throwable {
		 login.enterUN(FButility.gettd(0, 0));
		 login.enterPWD(FButility.gettd(0, 1));
		 login.clickLOGBTN();
		
	 }
	 @Test
	 public void verifytext() throws Throwable {
		 Reporter.log("running verifytext",true);
		 String exptext=home.verifytext();
		 String acttext=FButility.gettd(0, 2);
		 Assert.assertEquals(exptext, acttext);
	 }
	 @AfterMethod
	 public void closebrowser() {
		 Reporter.log("close browser",true);
	 }
	 @AfterClass
	 public void closeapplication() {
		 Reporter.log("close application",true);
	 }
}
