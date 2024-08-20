package ParaBankTextCase;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseOfAboutUs {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

         driver.get("https://parabank.parasoft.com/parabank/about.htm");
         driver.findElement(By.linkText("About Us")).click();
         
         List<WebElement> parasoftdemowebsiteLink = driver.findElements(By.linkText("ParaSoft Demo Website"));
         System.out.println("ParaSoft Demo Website is present");
         
         WebElement wwwparasoftcomLink = driver.findElement(By.linkText("www.parasoft.com"));
         System.out.println(" www.parasoft.com is present");
 
         List<WebElement> call8883050041Link = driver.findElements(By.linkText(" call 888-305-0041"));
         System.out.println(" call 888-305-0041  is present");
	}

}
