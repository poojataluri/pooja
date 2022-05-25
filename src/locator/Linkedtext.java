package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedtext {
	static {
		System.setProperty("webDriver.chrome.driver","./Driver/ChromeDriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.selenium.dev/");
       driver.manage().window().maximize();
       driver.findElement(By.linkText("Downloads")).click();
       driver.findElement(By.partialLinkText("Downl")).click();
	}

}
