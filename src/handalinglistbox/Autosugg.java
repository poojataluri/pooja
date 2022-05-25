package handalinglistbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosugg {
	static {
		System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("seleni");
		Thread.sleep(3000);
	 List<WebElement> liele = driver.findElements(By.xpath("//li[@class='sbct']"));
		int count = liele.size();
		System.out.println(count);
		for(int i=0; i<count;i++) {
			Thread.sleep(3000);
			WebElement sugg = liele.get(i);
			String text = sugg.getText();
			System.out.println(text);
			
		}
          liele.get(3).click();
		

	}

}
