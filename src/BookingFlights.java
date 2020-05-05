import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BookingFlights {


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/shakirchowdhury/Desktop/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.expedia.com/Flights");
		driver.findElement(By.id("flight-origin-flp")).sendKeys("new york");
		driver.findElement(By.id("flight-destination-flp")).sendKeys("London");
		Thread.sleep(2000);
		driver.findElement(By.id("flight-departing-flp")).sendKeys("04/26/2020");
		Thread.sleep(2000);
		driver.findElement(By.id("flight-returning-flp")).click();
		driver.findElement(By.xpath("(//button[@data-day='30'])[1]")).click();
		driver.findElement(By.id("flight-add-car-checkbox-flp")).click();
		
		//driver.findElement(By.id("flight-returning-flp")).clear();
		//driver.findElement(By.id("flight-returning-flp")).clear();
		//driver.findElement(By.id("flight-returning-flp")).sendKeys("05/26/2020");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("(//button[@type='submit']/span[text()='Search'])[1]")).click();
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("(//button[@type='submit']/span[text()='Search'])[1]"))).build().perform();
		driver.findElement(By.xpath("/html/body/meso-native-marquee/section/div/div/div[1]/section/div/div[2]/div[2]/section[1]/form/div[8]/label/button")).click();
		Thread.sleep(20000);
		driver.close();
	}

}
