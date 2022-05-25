package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginassignment {
	static{
		System.setProperty("Webdriver.Chrome.driver", "./driver/Chromedeiver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("abcd");
        driver.findElement(By.name("pass")).sendKeys("orange");
        driver.findElement(By.name("login")).click();
        String t=driver.getTitle();
        System.out.println("title is t");
      
	}

}
