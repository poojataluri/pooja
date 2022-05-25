package getters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getsize {
	static {
		System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement ele1 = driver.findElement(By.id("email"));
        Dimension sizes1 = ele1.getSize();
        int h1 = sizes1.getHeight();
        int w1 = sizes1.getWidth();
        System.out.println("username height");
        System.out.println("username width");
        WebElement ele2 = driver.findElement(By.id("pass"));
       Dimension sizes2 = ele2.getSize();
       int h2 = sizes2.getHeight();
       int h = sizes2.getWidth();
       System.out.println("password height");
       System.out.println("pasword width");
	}

}
