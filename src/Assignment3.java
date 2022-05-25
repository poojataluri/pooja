import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	static {
		System.setProperty("WebDriver.chrome.driver","./driver.ChromeDriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.amazon.com/");
       driver.findElement(By.linkText("Today's deal")).click();
       
	}

}
