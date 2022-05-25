package webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
	static {
		System.setProperty("Webdriver.chrome.driver","./driver/Chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com/");
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    WebElement st =driver.findElement(By.name("q"));
    st.sendKeys("pendrive");
    st.clear();
	}

}
