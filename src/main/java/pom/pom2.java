package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom2 {
	@FindBy(xpath="//input[@id='ap_password']")private WebElement PWD;
	@FindBy(xpath="//input[@class='a-button-input']")private WebElement SIGNIN;
	public pom2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterPWD(String password) {
		PWD.sendKeys(password);
	}
	public void clickSIGNIN() {
		SIGNIN.click();
	}
}
