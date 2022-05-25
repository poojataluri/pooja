package verification;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplayed {
	static {
		System.setProperty("Webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver driver = new ChromeDriver();
	       driver.get("https://www.facebook.com/");
	       driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	        WebElement username = driver.findElement(By.id("email"));
	       if(username.isDisplayed()) {
	    	   System.out.println("testcase pass");
	    	   username.sendKeys("abcd");
	    	   WebElement loginbutt = driver.findElement(By.name("login"));
	    	   if(loginbutt.isEnabled()) {
	    		   System.out.println("enable is pass");
	    		   loginbutt.click();
	    	   }
	       }
	}

}
