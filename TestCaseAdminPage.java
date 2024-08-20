package ParaBankTextCase;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseAdminPage {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

         driver.get("https://parabank.parasoft.com/parabank/admin.htm");
         
         List<WebElement> administrationLink = driver.findElements(By.linkText( "Administration"));
         System.out.println("Administration is present");
         
         List<WebElement> databaseLink = driver.findElements(By.linkText("Database"));
         System.out.println("Database is present");
         
         List<WebElement> jmsserviceLink = driver.findElements(By.linkText("JMS Service"));
         System.out.println("JMS Service is present");
         
         
         List<WebElement> dataaccessmodeLink = driver.findElements(By.linkText("Data Access Mode"));
         System.out.println("Data Access Mode is present");
         
         List<WebElement> webserviceLink = driver.findElements(By.linkText("Web Service"));
         System.out.println("Web Service is present");
         
         List<WebElement> applicationsettingsLink = driver.findElements(By.linkText("Application Settings"));
         System.out.println("Application Settings is present");
     
     }
           
	}

