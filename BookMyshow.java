package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BookMyshow {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.get("https://in.bookmyshow.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search for your city']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//span[@class='sc-dBaXSw gYlrLO']")).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='sc-kxynE gLkGwh']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for Movies, Events, Plays, Sports and Activities']")).sendKeys("Pathaan");
		driver.findElement(By.xpath("//div[@class='sc-fFTYTi exELNQ']")).click();
		driver.findElement(By.xpath("//span[text()='Book tickets'][1]")).click();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//span[text()='2D']")).click();
		WebElement flim = driver.findElement(By.className("__venue-name"));
		String theater = flim.getText();
		System.out.println("Displayed theater name :"+theater);
		driver.findElement(By.xpath("//div[text()='INFO'][1]")).click();
		
		String text = driver.findElement(By.xpath("//div[text()='            Parking Facility        ']")).getText();
		if(text.contains("Parking Details")){
			System.out.println("Parking feasility avaiable");
		}
		else{
			System.out.println("Parking feasility not avaiable");
		}
		
		driver.findElement(By.xpath("//div[@class='cross-container']")).click();
		driver.findElement(By.xpath("//div[@class='__text'][3]")).click();
		driver.findElement(By.id("btnPopupAccept")).click();
		driver.findElement(By.xpath("//li[text()='1']")).click();
		driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
		driver.findElement(By.xpath("//a[@class='_available'][1]")).click();
		driver.findElement(By.xpath("//span[@id='btnSTotal_reserve']")).click();
		
		String Total = driver.findElement(By.xpath("//span[@id=1subTT1]")).getText();
		System.out.println("Subtotal is :"+Total);
		Thread.sleep(2000);
		
	}

}
