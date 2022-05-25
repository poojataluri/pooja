package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadpopup {
	static {
		System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sharankumar/Desktop/New%20folderhtml/New%20Text%20Document.html");
		driver.findElement(By.id("cv")).sendKeys("C:\\Users\\Sharankumar\\Downloads\\PassportApplicationForm_Main_English_V4.0 (1).pdf");

	}

}
