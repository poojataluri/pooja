package popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popupcloseallwindowexceptparentwindow {
	static {
		System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		String pa = driver.getWindowHandle();
		driver.findElement(By.id("button1")).click();
		Set<String> wh = driver.getWindowHandles();
		for(String a:wh) {
			driver.switchTo().window(a);
			if(a.equals(pa)) {
				
			}
			else {
				driver.close();
			}
		}

	}

}
