package handalinglistbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Html {
static {
	System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/cg/mtr.html");
		WebElement listbox = driver.findElement(By.id("slv"));
		Select s= new Select(listbox);
		s.selectByValue("c");
		s.selectByIndex(3);
		s.selectByVisibleText("vada");
		if(s.isMultiple()==true) {
			s.deselectByVisibleText("vada");
		}

	}

}
