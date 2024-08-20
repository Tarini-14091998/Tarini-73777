package ParaBankTextCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseOfOpenNewAccount {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

         driver.get("https://parabank.parasoft.com/parabank/openaccount.htm");
         
         WebElement userNameField = driver.findElement(By.name("username"));
         WebElement passwordField = driver.findElement(By.name("password"));
         Thread.sleep(4000);
         
         userNameField.sendKeys("tariniraj@gmail.com");
         passwordField.sendKeys("raj123");
         Thread.sleep(4000);
         
         WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
         loginButton.click();
         
         WebElement opennewaccountButton = driver.findElement(By.linkText("Open New Account"));
         opennewaccountButton.click();
        
         WebElement typelink = driver.findElement(By.id("type"));
         typelink.sendKeys("Savings");
         
         WebElement initialDepositField = driver.findElement(By.id("fromAccountId"));
         initialDepositField.sendKeys("13566");
         
         WebElement submitButton = driver.findElement(By.xpath("//input[@value='Open New Account']"));
         submitButton.click();
          System.out.println("Successfully open new account ");
         
	}

}
