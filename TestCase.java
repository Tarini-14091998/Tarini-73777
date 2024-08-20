package ParaBankTextCase;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

         driver.get("https://parabank.parasoft.com/parabank/index.htm");
        
         WebElement registerButton = driver.findElement(By.linkText("Register"));
         registerButton.click();
        
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
         
         WebElement registerButton1 = driver.findElement(By.className("button"));
         registerButton1.click();
       
//Navigate to login page 
         
         WebElement userNameField = driver.findElement(By.name("username"));
         WebElement passwordField = driver.findElement(By.name("password"));
         Thread.sleep(4000);
         
         userNameField.sendKeys("tariniraj@gmail.com");
         passwordField.sendKeys("raj123");
         Thread.sleep(4000);
         
         WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
         loginButton.click();

         System.out.println("Successfully login");
		
//Navigate to Home Page 
		
         WebElement homeLink = driver.findElement(By.linkText("home"));
         System.out.println("Home  is present");
         
         WebElement aboutUsLink = driver.findElement(By.linkText("About Us"));
         System.out.println("About us is present");
         
         WebElement locationLink = driver.findElement(By.linkText("Locations"));
         System.out.println("location is present");
         
         WebElement adminpageLink = driver.findElement(By.linkText("Admin Page"));
         System.out.println("Admin page is present");
         
         WebElement productsLink = driver.findElement(By.linkText("Products"));
         System.out.println("Products is present");
          
         WebElement contactUsLink = driver.findElement(By.linkText("Contact Us"));
         System.out.println("contact us is present");
         
         WebElement sitemapLink = driver.findElement(By.linkText("Site Map"));
         System.out.println("Site Map is present");
         
         WebElement forumLink = driver.findElement(By.linkText("Forum"));
         System.out.println("Forum is present");
         
         List<WebElement> solutionsLink = driver.findElements(By.linkText("Solutions"));
         System.out.println("Solutions is present");
         
         List<WebElement> atmServicesLink = driver.findElements(By.linkText("ATM Services"));
         System.out.println("Atm services is displayed");
         
         List<WebElement> onlineserviceslink = driver.findElements(By.linkText("Online Services"));
         System.out.println("Online services is displayed");
         
         List<WebElement> customerloginLink = driver.findElements(By.linkText("Customer Login"));
         System.out.println("customer login is present");
         
         List<WebElement> paraBankisnowreopenedLink = driver.findElements(By.linkText("ParaBank Is Now Re-Opened"));
         System.out.println("ParaBank Is Now Re-Opened is present");
         
         List<WebElement> newonlinebillpayLink = driver.findElements(By.linkText("New! Online Bill Pay"));
         System.out.println("New! Online Bill Pay is present");
         
         List<WebElement> newonlineaccounttransferLink = driver.findElements(By.linkText("New! Online Account Transfers"));
         System.out.println("New! Online Account Transfers");
         
//AdminPage
         
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
         
//Services page 
         
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
       
//Open New  Account 
         
         WebElement opennewaccountButton = driver.findElement(By.linkText("Open New Account"));
         opennewaccountButton.click();
        
         WebElement typelink = driver.findElement(By.id("type"));
         typelink.sendKeys("Savings");
         
         WebElement initialDepositField = driver.findElement(By.id("fromAccountId"));
         initialDepositField.sendKeys("13566");
         
         WebElement submitButton = driver.findElement(By.xpath("//input[@value='Open New Account']"));
         submitButton.click();
          System.out.println("Successfully open new account ");
          
//Account Overview
          
          WebElement accountsoverviewlink = driver.findElement(By.linkText("Accounts Overview"));
          accountsoverviewlink.click();
          
           WebElement accountTablelink = driver.findElement(By.id("accountTable"));
           
           if (accountTablelink.isDisplayed()) {
               System.out.println("Account Overview page is displayed.");
           } else {
               System.out.println("Account Overview page is not displayed.");
           }
 
//Transfer Funds
           
           WebElement TransferFundslink = driver.findElement(By.linkText("Transfer Funds"));
           TransferFundslink.click();
           
           System.out.println("Transfer Funds is displayed");
           
           WebElement amountlink = driver.findElement(By.id("amount"));
           amountlink.sendKeys("77");
           
           WebElement fromaccountidlink = driver.findElement(By.id("fromAccountId"));
           fromaccountidlink.sendKeys("14898");
           
           WebElement toaccountidlink = driver.findElement(By.id("toAccountId"));
           toaccountidlink.sendKeys("14898");
           
           WebElement transferButton = driver.findElement(By.className("button"));
           transferButton.click();

           System.out.println("Sccessfully Transfer Funds ");
           
//Bill Pay
           
           WebElement BillPaylink = driver.findElement(By.linkText("Bill Pay"));
           BillPaylink.click();
           
           WebElement namelink  = driver.findElement(By.name("payee.name"));
           namelink.sendKeys("Tarini prasad");
           
           WebElement addresslink = driver.findElement(By.name("payee.address.street"));
           addresslink.sendKeys("Marathalli");
           
           WebElement citylink = driver.findElement(By.name("payee.address.city"));
           citylink.sendKeys("Bangalore");
           
           WebElement statelink = driver.findElement(By.name("payee.address.state"));
           statelink.sendKeys("Karnataka");
           
           WebElement zipCodelink = driver.findElement(By.name("payee.address.zipCode"));
           zipCodelink.sendKeys("57201");
           
           WebElement phoneNumberlink = driver.findElement(By.name("payee.phoneNumber"));
           phoneNumberlink.sendKeys("+91 9876543210");
           
           WebElement accountnumberlink = driver.findElement(By.name("payee.accountNumber"));
           accountnumberlink .sendKeys("8529637410");
           
           WebElement verifyAccountlink = driver.findElement(By.name("verifyAccount"));
           verifyAccountlink .sendKeys("8529637410");
           
           WebElement amountlink1 = driver.findElement(By.name("amount"));
           amountlink1 .sendKeys("85");
           
           WebElement fromAccountIdlink = driver.findElement(By.name("fromAccountId"));
           fromAccountIdlink .sendKeys("7418529630");
          
           WebElement SendPaymentButton = driver.findElement(By.className("button"));
           SendPaymentButton.click();
           
//LogOut 
          WebElement logoutLink = driver.findElement(By.xpath("//a[text()='Log Out']"));
          logoutLink.click();
  		
  		System.out.println("successfully logout ");
	}
}