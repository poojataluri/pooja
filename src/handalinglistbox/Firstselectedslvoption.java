package handalinglistbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Firstselectedslvoption {
	static {
		System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/cg/slv.html");
		WebElement slvlistbox = driver.findElement(By.id("slv"));
		Select s= new Select(slvlistbox);
		WebElement option = s.getFirstSelectedOption();
		String text = option.getText();
		System.out.println(text);

	}

}
