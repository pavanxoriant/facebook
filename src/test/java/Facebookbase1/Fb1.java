package Facebookbase1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb1 {
public void initializebrowser() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pavan\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
}
