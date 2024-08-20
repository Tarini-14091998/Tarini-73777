package ParaBankTextCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseRegisterPage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

         driver.get("https://parabank.parasoft.com/parabank/register.htm");
         
        //Navigate to Register page
       
         WebElement firstName = driver.findElement(By.name("customer.firstName"));
         WebElement lastName = driver.findElement(By.name("customer.lastName"));
         WebElement address = driver.findElement(By.name("customer.address.street"));
         WebElement city = driver.findElement(By.name("customer.address.city"));
         WebElement state = driver.findElement(By.name("customer.address.state"));
         WebElement zipCode = driver.findElement(By.name("customer.address.zipCode"));
         WebElement phoneNumber = driver.findElement(By.name("customer.phoneNumber"));
         WebElement ssn = driver.findElement(By.name("customer.ssn"));
         WebElement userName = driver.findElement(By.name("customer.username"));
         WebElement password = driver.findElement(By.name("customer.password"));
         WebElement confirmPassword = driver.findElement(By.name("repeatedPassword"));
         
         firstName.sendKeys("Tarini prasad");
         lastName.sendKeys("sahoo");
         address.sendKeys("Marathalli");
         city.sendKeys("Bangalore");
         state.sendKeys("Karnataka");
         zipCode.sendKeys("57201");
         phoneNumber .sendKeys("+91 9876543210");
         ssn.sendKeys("123456789");
         userName.sendKeys("tariniraj@gmail.com");
         password.sendKeys("raj123");
         confirmPassword.sendKeys("raj123");
         
         WebElement registerButton = driver.findElement(By.className("button"));
         registerButton.click();
         
         WebElement successMessage = driver.findElement(By.id("successMessage"));
	}

}
