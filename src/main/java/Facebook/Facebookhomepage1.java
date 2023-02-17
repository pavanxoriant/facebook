package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebookhomepage1 {
@FindBy(xpath="//span[text()='Your shortcuts']")private WebElement shortcut;
public Facebookhomepage1(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public String verifytext(String exttext) {
	String acttext=shortcut.getText();
	return acttext;
}
}
