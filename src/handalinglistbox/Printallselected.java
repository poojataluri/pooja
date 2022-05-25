package handalinglistbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Printallselected {
	static {
		System.setProperty("Webdriver.chrome.driver","/driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/cg/slv.html");
		WebElement listbox = driver.findElement(By.id("slv"));
		Select s = new Select(listbox);
		List<WebElement> alloption = s.getAllSelectedOptions();
		for(WebElement option:alloption) {
			String text = option.getText();
			System.out.println(text);
		}

	}

}
