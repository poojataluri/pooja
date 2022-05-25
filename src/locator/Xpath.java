package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	static {
		System.setProperty("Webdriver.chrome.driver","./driver.Chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("apple");
		driver.findElement(By.xpath("//input[@class=''inputtext _55r1 _6luy _9npi]")).sendKeys("orange");
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();

	}

}
