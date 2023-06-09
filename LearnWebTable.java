package Marathon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWebTable {

	public static void main(String[] args) {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("remote-allow-origins=*");
	ChromeDriver driver=new ChromeDriver(option);
	driver.get("https://html.com/tags/table/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	List<WebElement> noOfRows = driver.findElements(By.xpath("//table[@class='attributes-list']//tr"));
	int rowSize = noOfRows.size();
	System.out.println(rowSize);
	List<WebElement> noOfColumn = driver.findElements(By.xpath("//table[@class='attributes-list']//tr[1]/th"));
	int columnSize = noOfColumn.size();
	System.out.println(columnSize);
	}
}
