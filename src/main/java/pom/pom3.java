package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom3 {
	@FindBy(xpath="//a[text()='Amazon Pay']")private WebElement AMAZON;
	public pom3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public String verifyamazon() {
		String actID=AMAZON.getText();
		return actID;
	}
}
