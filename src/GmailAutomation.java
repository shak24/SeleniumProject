


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAutomation {
	//public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/shakirchowdhury/Desktop/chromedriver");
		driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(2000);
		driver.findElement(By.id("identifierId")).sendKeys("shakir1255@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		
		//driver.close();
}
	
}