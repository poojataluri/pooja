package getters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getlocation {
	static {
		System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.facebook.com/");
       driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
       WebElement ele = driver.findElement(By.name("email"));
      WebElement ele2 = driver.findElement(By.id("passContainer"));
       Point lo = ele.getLocation();
       Point l = ele2.getLocation();
       int x1 = lo.getX();
       int y1 = lo.getY();
       System.out.println("location of x1");
       System.out.println("location of y1");
       int x2 = l.getX();
       int y2 = l.getY();
       System.out.println("location of x2");
       System.out.println("location of y2");
       if(x1 == x2) {
    	   System.out.println("alingmentcorrect,text pass");
    	   
    	   
       }
       
       else {
    	   System.out.println("allignment not correct, test fail");
       }
	}

}
