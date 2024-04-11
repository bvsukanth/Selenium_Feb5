package SeleniumTraining;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aa.com/homePage.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// synchronization techniques
		driver.manage().window().maximize();// This is for maximizing window

		driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();

		while (!(driver
				.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/div/div/span[1]"))
				.getText().equals("December"))) {
			driver.findElement(By.cssSelector(".ui-datepicker-next")).click();
		}
		
		List<WebElement> dateRows = driver.findElements(By.xpath("//td[@data-event='click']/a"));
		
		for(WebElement date : dateRows)
		{
			if(date.getText().equals("24"))
			{
				date.click();
				break;
			}
		}

	}

}
