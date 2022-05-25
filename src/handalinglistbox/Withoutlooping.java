package handalinglistbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Withoutlooping {
	static {
		System.setProperty("Webdriver.chrome.driver","/driver/chromedriver.exe");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); 
		driver.get("file:///F:/cg/slv.html");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement listbox = driver.findElement(By.id("slv"));
		Select s = new Select(listbox);
		
		WebElement alloption = s.getWrappedElement();
		String text = alloption.getText();
		System.out.println(text);

	}

}
