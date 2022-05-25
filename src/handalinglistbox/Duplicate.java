package handalinglistbox;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Duplicate {
	static {
		System.setProperty("Webdriver.chrome.driver","/driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/cg/slv.html");
		WebElement listbox = driver.findElement(By.id("slv"));
		Select s = new Select(listbox);
		List<WebElement> alloption = s.getOptions();
		ArrayList<String>a=new ArrayList<>();
		for( WebElement opt:alloption) {
			String text = opt.getText();
			a.add(text);
				System.out.println(text);
			}
		}

	}


