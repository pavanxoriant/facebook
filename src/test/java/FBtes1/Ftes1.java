package FBtes1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import FacebookUtility.FButility;
import FacebookUtility1.Fu1;
import Facebookbase1.Fb1;
import pomfacebook.Facebookhomepage;
import pomfacebook.Facebookloginpage;

public class Ftes1 extends Fb1{
	Facebookloginpage login;
	Facebookhomepage home;
@BeforeClass
public void openbrowser() {
	initializebrowser();
		WebDriver driver = null;
		login=new Facebookloginpage(driver);
 home =new Facebookhomepage(driver);
}
 @BeforeMethod
 public void loginapplication() throws Throwable {
	 login.enterUN(Fu1.getTD(0, 0));
	 login.enterPWD(Fu1.getTD(0, 1));
	 login.clickLOGBTN();
 }
 @Test
 public void verifytext() throws Throwable {
	 Reporter.log("verifytext",true);
	 String acttext=home.verifytext();
	 String exptext=Fu1.getTD(0, 2);
	 Assert.assertEquals(exptext, acttext);
	 
}
 @AfterMethod
 public void logoutapplication() {
	 Reporter.log("logoutapplication",true);
 }
 @AfterClass
 public void closebrowser() {
	 Reporter.log("closebroser",true);
 }
}
