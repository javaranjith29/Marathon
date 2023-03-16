package Marathon;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class Salesforce2 {


	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		//WindowHandling
		Set<String> winHandle = driver.getWindowHandles();
		List<String> winHandle1 = new ArrayList <String>(winHandle);
		driver.switchTo().window(winHandle1.get(1));
		
		WebElement ButtonFn = driver.findElement(By.xpath("//button[text()='Confirm']"));
		driver.executeScript("arguments[0].click();", ButtonFn);
		
		Shadow dom = new Shadow(driver);
		dom.findElementByXPath("//span[text()='Learning']").click();
		WebElement mouseH = dom.findElementByXPath("//span[text()='Learning on Trailhead']");
		WebElement function1 = dom.findElementByXPath("//a[text()='Salesforce Certification']");
		
		// Perform the mouse hover action
		Actions act = new Actions(driver);
		act.moveToElement(mouseH).click(function1).perform();
		
		 List<WebElement> certifi = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
			for(WebElement certificate:certifi)
			{
				String cert = certificate.getText();
				System.out.println("certificate Name");
			System.out.println(cert);
		
		
		
		
}
	}
}
