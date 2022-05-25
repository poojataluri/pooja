package getters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {
	static {
		System.setProperty("Webdriver.Chrome.driver","./driver/Chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    driver.get("https://www.facebook.com/");
     WebElement el = driver.findElement(By.xpath("\"//h2[@class='_8eso']"));
     String txt1 = el.getText();
     System.out.println(txt1);
     driver.close();
	}

}
