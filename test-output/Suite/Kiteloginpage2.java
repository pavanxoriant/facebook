import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kiteloginpage2 {
	@FindBy(xpath="//input[@id='pin']")private WebElement PIN;
	@FindBy(xpath="//button[text()='Continue ']")private WebElement ctnbtn;
	//step2initialization
	public  Kiteloginpage2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//step3 implementation
	public void enterPIN(String PIN1) {
		PIN.sendKeys(PIN1);
	}
	public void clickctnbtn() {
		ctnbtn.click();
	}
}
