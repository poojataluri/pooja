package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginassignment2 {
	static {
		System.setProperty("Webdriver.chrome.driver","./driver/Chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.binance.com/en/login");
        driver.findElement(By.id("tel-national")).sendKeys("abcd");
        driver.findElement(By.name("password")).sendKeys("orange");
        driver.findElement(By.id("click_login_submit")).click();
	}

}
