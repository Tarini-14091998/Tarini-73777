package ParaBankTextCase;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseHomePage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

         driver.get("https://parabank.parasoft.com/parabank/index.htm");
       
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
         
         WebElement paraBankisnowreopenedLink = driver.findElement(By.linkText("ParaBank Is Now Re-Opened"));
         System.out.println("ParaBank Is Now Re-Opened is present");
         
         WebElement newonlinebillpayLink = driver.findElement(By.linkText("New! Online Bill Pay"));
         System.out.println("New! Online Bill Pay is present");
         
         WebElement newonlineaccounttransferLink = driver.findElement(By.linkText("New! Online Account Transfers"));
         System.out.println("New! Online Account Transfers");
         
	}
}