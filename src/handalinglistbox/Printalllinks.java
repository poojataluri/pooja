package handalinglistbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printalllinks {
	static {
		System.setProperty("Webdriver.chrome.driver","/driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		List<WebElement> alllink = driver.findElements(By.xpath("//a"));
		int count = alllink.size();
		System.out.println(count);
		for(int i=0; i<count;i++) {
			WebElement link = alllink.get(i);
			String text = link.getText();
			System.out.println(text);
		}

	}

}
