package webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {
	static {
		System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   WebDriver driver = new ChromeDriver();
   driver.get("https://www.amazon.com/");
   driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
   
   driver.findElement(By.id("nav-search-submit-button")).submit();
		  
	}

}
