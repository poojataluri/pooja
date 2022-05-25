package handalinglistbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Allselectedoption {
	static {
		System.setProperty("Webdriver.chrome.driver","/driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/cg/slv.html");
		WebElement slvlistbox = driver.findElement(By.id("slv"));
		Select s= new Select(slvlistbox);
		List<WebElement>alloption = s.getAllSelectedOptions();
		int count = alloption.size();
		for(int i=0 ; i <count; i++) {
				Object text = alloption.get(i);
				System.out.println(text);
				
		
		
		
		

	}

	}
}
