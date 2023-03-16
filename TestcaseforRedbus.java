package Marathon;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestcaseforRedbus {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[@class='selected']")).click();
		driver.findElement(By.id("dest")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[@class='selected']")).click();
	
		driver.findElement(By.xpath("//td[text()='25']")).click();
		driver.findElement(By.xpath("//button[@class='fl button']")).click();
	
		Thread.sleep(2000);
		
		WebElement busNumber = driver.findElement(By.xpath("//span[@class='f-bold busFound']"));
		String text1 = busNumber.getText();
		System.out.println("No.of.Buses Found :"+text1);
	
		WebElement Sleeper = driver.findElement(By.xpath("//label[text()='SLEEPER']"));
		String text = Sleeper.getText();
		System.out.println("No.of.Buses Found :"+text);
		System.out.println(driver.getTitle());
	}
}

