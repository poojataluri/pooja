package org.ipl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchwebebrowser {
	static {
		System.setProperty("webDriver.chrome.driver",",/driver/chrome.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.instagram.com/");
      System.out.println(driver.getTitle());
      System.out.println(driver.getCurrentUrl());
      driver.close();
	}

}
