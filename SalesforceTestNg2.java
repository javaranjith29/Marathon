package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class SalesforceTestNg2 {

	public static void main(String[] args) {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		EdgeDriver driver = new EdgeDriver(options);

		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.id("Login")).click();
	
		//Click the App launcher
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		WebElement Click = driver.findElement(By.xpath("//input[@class='slds-input']"));
		Click.sendKeys("Sales");
		Click.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("(//span[@class='viewAllLabel'])[4]")).click();
		driver.findElement(By.xpath("//div[text()='New']")).click();
		//incase table format they give as a <input> tag means use following code
       
        driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("3/25/2023");
        driver.findElement(By.);
        driver.findElement(By.xpath("(//input[@class='slds-input'])[4]")).sendKeys("Ranjith.R");
        //dropdown
        WebElement dropdown = driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[1]"));
		dropdown.sendKeys("Needs Analysis");
		dropdown.sendKeys(Keys.ENTER);
		
		

	}

}
