package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	static {
		System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://demoapp.skillrary.com/login.php?type=login");
       driver.findElement(By.id("email")).sendKeys("admin");
       driver.findElement(By.name("password")).sendKeys("admin");
       driver.findElement(By.name("login")).click();
       System.out.println(driver.getTitle());
       System.out.println(driver.getCurrentUrl());
       
	}

}
