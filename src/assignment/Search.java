package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
	static {
		System.setProperty("WebDriver.chrome.driver","./driver/ChromeDriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://www.facebook.com/");
          driver.findElement(By.linkText("Forgotten password?")).click();
          driver.findElement(By.id("identify_email")).sendKeys("user");
          driver.findElement(By.name("did_submit")).click();
	}

}
