package test1;

import org.openqa.selenium.devtools.v101.network.model.ReportingApiEndpoint;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Base.Base2;
import Utility.Utility;
import pom.pom1;
import pom.pom2;
import pom.pom3;


public class Test2 extends Base2   {
	pom1 p1;
	pom2 p2;
	pom3 p3;
@BeforeClass
public void openBrowser() {
	initializebrowser();
      p1 = new pom1(driver);
	 p2 = new pom2(driver);
	p3 =new pom3(driver);
}
@BeforeMethod
public void logintoapp() throws Throwable {
	p1.enterUN(Utility.getTD(0, 0));
	p1.clickCTNBTN();
	p2.enterPWD(Utility.getTD(0, 1));
	p2.clickSIGNIN();
}
@org.testng.annotations.Test
public void verifyamazon() throws Throwable {
	Reporter.log("running verifyamazon",true);
	String actID=p3.verifyamazon();
	String expID=Utility.getTD(0, 2);
	Assert.assertEquals(actID, expID,"both are different test case is failed");
	
}
@AfterMethod
public void logouttoapp() {
	Reporter.log("logout",true);
}
@AfterClass
public void closebrowser() {
	Reporter.log("close",true);
}
}
