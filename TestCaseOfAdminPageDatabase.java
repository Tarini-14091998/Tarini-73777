package ParaBankTextCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseOfAdminPageDatabase {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

         driver.get("https://parabank.parasoft.com/parabank/admin.htm");
         
      // Verify and interact with the "Initialize" button
         WebElement initializeButton = driver.findElement(By.id("initialize_button_id")); 
         if (initializeButton.isDisplayed()) {
             System.out.println("Initialize button is displayed.");
             initializeButton.click();
             System.out.println("Initialize button clicked.");
         } else {
             System.out.println("Initialize button is not displayed.");
         }

         
         // Verify and interact with the "Clean" button
         WebElement cleanButton = driver.findElement(By.id("clean_button_id")); // Replace with actual ID
         if (cleanButton.isDisplayed()) {
             System.out.println("Clean button is displayed.");
             cleanButton.click();
             System.out.println("Clean button clicked.");
         } else {
             System.out.println("Clean button is not displayed.");
         }

         // Verify the JMS Service status
         WebElement jmsStatus = driver.findElement(By.id("jms_status_id")); // Replace with actual ID
         String statusText = jmsStatus.getText();
         System.out.println("JMS Service Status: " + statusText);

         // Check if JMS Service status is "Running"
         if ("Running".equalsIgnoreCase(statusText.trim())) {
             System.out.println("JMS Service is running.");
         } else {
             System.out.println("JMS Service is not running. Status: " + statusText);
         }

         // Verify Data Access Modes
         WebElement soapMode = driver.findElement(By.id("soap_mode_id")); // Replace with actual ID
         WebElement restXmlMode = driver.findElement(By.id("rest_xml_mode_id")); // Replace with actual ID
         WebElement restJsonMode = driver.findElement(By.id("rest_json_mode_id")); // Replace with actual ID
         WebElement jdbcMode = driver.findElement(By.id("jdbc_mode_id")); // Replace with actual ID

         System.out.println("SOAP mode is " + (soapMode.isDisplayed() ? "displayed" : "not displayed"));
         System.out.println("REST (XML) mode is " + (restXmlMode.isDisplayed() ? "displayed" : "not displayed"));
         System.out.println("REST (JSON) mode is " + (restJsonMode.isDisplayed() ? "displayed" : "not displayed"));
         System.out.println("JDBC mode is " + (jdbcMode.isDisplayed() ? "displayed" : "not displayed"));

         // Verify Application Settings
         WebElement initBalance = driver.findElement(By.id("init_balance_id")); // Replace with actual ID
         WebElement minBalance = driver.findElement(By.id("min_balance_id")); // Replace with actual ID
         WebElement loanProvider = driver.findElement(By.id("loan_provider_id")); // Replace with actual ID
         WebElement threshold = driver.findElement(By.id("threshold_id")); // Replace with actual ID

         System.out.println("Initial Balance: " + initBalance.getAttribute("value"));
         System.out.println("Minimum Balance: " + minBalance.getAttribute("value"));
         System.out.println("Loan Provider: " + loanProvider.getText());
         System.out.println("Threshold: " + threshold.getAttribute("value"));
     }

	}


