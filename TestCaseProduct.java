package ParaBankTextCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseProduct {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

         driver.get("https://www.parasoft.com/products/");
         
         
         
         
         
	}

}