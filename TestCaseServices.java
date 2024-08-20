package ParaBankTextCase;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseServices {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

         driver.get("https://parabank.parasoft.com/parabank/services.htm");
         
         List<WebElement> availablebookstoresoapservicesLink = driver.findElements(By.linkText("Available Bookstore SOAP services"));
         System.out.println("Available Bookstore SOAP services is present");
         
         List<WebElement> bookstoreservicesLink = driver.findElements(By.linkText("Bookstore services"));
         System.out.println("Bookstore services is present");
         
         List<WebElement> availableparabanksoapservicesLink = driver.findElements(By.linkText("Available ParaBank SOAP services"));
         System.out.println("Available ParaBank SOAP services is present");
         
         List<WebElement> parabankservicesLink = driver.findElements(By.linkText("ParaBank services"));
         System.out.println("ParaBank services is present");
         
         List<WebElement> availablerestfulservicesLink = driver.findElements(By.linkText("Available RESTful services"));
         System.out.println(" Available RESTful services is present");  
         
         
	}
}