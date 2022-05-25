package org.ipl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatetoapplication {
	static {
		System.setProperty("Webdriver.chrome.driver","./driver/Chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.com/");
driver.get("https://www.flipkart.com/");
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();
	

	
	
	}

}
