package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector {
	static {
		System.setProperty("WebDriver.chrome.driver","./driver/Chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.get("https://demoapp.skillrary.com/login.php?type=login");
       driver.manage().window().maximize();
       driver.findElement(By.cssSelector("input[id='email']")).sendKeys("admin");
       driver.findElement(By.cssSelector("input[id='password']")).sendKeys("admin");
       driver.findElement(By.cssSelector("button[name='login']")).click();
	}

}
