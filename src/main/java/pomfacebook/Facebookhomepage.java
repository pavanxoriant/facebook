package pomfacebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebookhomepage {
	@FindBy(xpath="//span[text()='Your shortcuts']")private WebElement shortcut;
	public Facebookhomepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public String verifytext() {
		String acttext = shortcut.getText();
		return acttext;
	}
}
