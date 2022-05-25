package handalinglistbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlinglist {
	static {
		System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.facebook.com/");
     driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
     WebElement date = driver.findElement(By.name("birthday_day"));
       Select s = new Select( date);
       s.selectByIndex(3);
       s.selectByValue("5");
       s.selectByVisibleText("8");
	}

}
