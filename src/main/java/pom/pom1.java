package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom1 {
	@FindBy(xpath="//input[@id='ap_email']")private WebElement UN;
	@FindBy(xpath="//input[@class='a-button-input']")private WebElement CTNBTN;
	public pom1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterUN(String username) {
		UN.sendKeys(username);
	}
	public void clickCTNBTN() {
		CTNBTN.click();
}
}