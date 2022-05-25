package popup;



import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadgeneric {
static {
	System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\Sharankumar\\Downloads\\PassportApplicationForm_Main_English_V4.0 (1).pdf");
           File f = new File("C:\\Users\\Sharankumar\\Desktop\\data");	
           String apath = f.getAbsolutePath();
           driver.findElement(By.id("cv")).sendKeys(apath);
	
		

	}

}
