import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateOrangeHRM {
	//public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver1.exe");
		
		driver = new ChromeDriver();
		driver.get("https://s1.demo.opensourcecms.com/s/44");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Remove Frame']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("txtUsername")).sendKeys("opensourcecms");
		Thread.sleep(2000);
		driver.findElement(By.id("txtPassword")).sendKeys("opensourcecms");
		Thread.sleep(2000);
		driver.findElement(By.id("btnLogin")).click();
		driver.close();

	}

}
