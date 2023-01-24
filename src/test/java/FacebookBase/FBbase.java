package FacebookBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBbase {
public WebDriver driver;
public void initializebrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pavan\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://facebook.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
}
