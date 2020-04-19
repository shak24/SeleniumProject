import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
WebDriver driver;

	public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "/Users/shakirchowdhury/Desktop/chromedriver");
	
	driver = new ChromeDriver();
	driver.get("https://amazon.com");
		
	}
	public static void main(String[] args) {
		
	SeleniumTest obj = new SeleniumTest();
	obj.launchBrowser();
	
	}

}
