package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {
static {
	System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("9876");
		driver.findElement(By.name("dob")).click();
		WebElement ele = driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
		Select s = new Select(ele);
		WebElement ele1 = driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
				Select s1 = new Select( ele1 );
				driver.findElement(By.xpath("//a[text()='14']")).click();
				driver.findElement(By.id("alternative_number")).sendKeys("98765");
				driver.findElement(By.id("renew_policy_submit")).click();
				WebElement text = driver.findElement(By.id("alternative_number_error"));
				System.out.println( text.getText());
				
				

	}
}
