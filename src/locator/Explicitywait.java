package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitywait {


	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}

	public static void main(String[] args, Object un) {
		// TODO Auto-generated method stu
    WebDriver driver = new ChromeDriver();
    driver.get("https://demoapp.skillrary.com/login.php?type=login");
    WebDriverWait wait = new WebDriverWait(driver,6);
    WebElement u = driver.findElement(By.id("email"));
    

	}

}
