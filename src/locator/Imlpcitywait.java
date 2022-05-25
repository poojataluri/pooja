package locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imlpcitywait {
	static {
		System.setProperty("Webdriver.chrome.driver","./driver/Chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.instagram.com/accounts/login/?hl=en");
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      driver.findElement(By.name("username")).sendKeys("abcdef");
      driver.findElement(By.name("password")).sendKeys("orangeee");
      driver.findElement(By.xpath("//div[text()='Log In']")).click();
	}

}
