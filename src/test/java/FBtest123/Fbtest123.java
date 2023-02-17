package FBtest123;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base123.Base1234;
import Facebook.Facebookhomepage1;
import Facebook.Facebookloginpage1;
import Utility123.Utility1234;

public class Fbtest123 extends Base1234{
	Facebookloginpage1 login;
	Facebookhomepage1 home;
	
@BeforeClass
public void openbrowser() {
	initializebrowser();
	WebDriver driver=null;
	 login=new Facebookloginpage1(driver);
 home=new Facebookhomepage1 (driver);
}

@BeforeMethod
public void openapplication() throws Throwable {
	login.enterUN(Utility1234.getTD(0, 0));
	login.enterPWD(Utility1234.getTD(0, 1));
	login.clickLOGBTN();
}
@Test
public void verifytext() throws Throwable {
	Reporter.log("running verifytext",true);
	String exptext=Utility1234.getTD(0, 2);
	String acttext=home.verifytext(null);
	Assert.assertEquals(exptext, acttext);
}
@AfterMethod
public void closeapplication() {
	Reporter.log("close app",true);
}
@AfterClass
public void closebrowser() {
	Reporter.log("close browser",true);
}
}
