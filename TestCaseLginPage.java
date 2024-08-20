package ParaBankTextCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class TestCaseLginPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

         driver.get("https://parabank.parasoft.com/parabank/index.htm");
         
         WebElement userNameField = driver.findElement(By.name("username"));
         WebElement passwordField = driver.findElement(By.name("password"));
         Thread.sleep(4000);
         
         userNameField.sendKeys("tariniraj@gmail.com");
         passwordField.sendKeys("raj123");
         Thread.sleep(4000);
         
         WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
         loginButton.click();

         System.out.println("Successfully login");
	}

}
