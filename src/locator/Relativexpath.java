package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpath {
	static {
		System.setProperty("Webdriver.chrome.driver","./driver.Chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.get("https://demoapp.skillrary.com/login.php?type=login");
     driver.findElement(By.id("email")).sendKeys("admin");
     driver.findElement(By.id("password")).sendKeys("admin");
     driver.findElement(By.id("last")).click();
     String t =driver.getTitle();
     System.out.println("title is t");
     if(t.equals("SkillRary Ecommerce")) {
       System.out.println("title displayed,its pass");     
	}
     else {
    	 System.out.println("title is not matching,its fail");
     }
	}
}
