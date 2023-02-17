package Base123;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base1234 {
public void initializebrowser() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\pavan\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
}
}
