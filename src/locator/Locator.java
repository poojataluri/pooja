package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	static {
		System.setProperty("webDriver.chrome.driver","./driver/chromeDriver.exe");
	}

	public static void main(String[]args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demoapp.skillrary.com/login.php?type=login");
      Thread.sleep(3000);
      driver.findElement(By.id("email")).sendKeys("admin");
      driver.findElement(By.name("password")).sendKeys("admin");
      driver.findElement(By.name("login")).click();
      driver.close();
	}

}
