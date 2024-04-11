package SeleniumTraining;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class webTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// synchronization techniques
		driver.manage().window().maximize();// This is for maximizing window

		// JavascriptExecutor syntax
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,500)");
		
		List<WebElement> amount = driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));
		
		int sum = 0;
		
		for(WebElement element : amount)
		{
			System.out.println(element.getText());
			sum = sum + Integer.parseInt(element.getText());
		}
		
		System.out.println("Sum of amount after addition : " + sum);
		
		System.out.println(driver.findElement(By.className("totalAmount")).getText());
		
		String sumFromWeb = driver.findElement(By.className("totalAmount")).getText().split(" ")[3].trim();
		
		Assert.assertEquals(Integer.parseInt(sumFromWeb), sum);
		
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[1]"));
		
		boolean value = false;
		for(WebElement element1 : names)
		{
			if(element1.getText().equalsIgnoreCase("Jack"))
			{
				value = true;
				break;
			}
			else
			{
				value = false;
			}
		}
		
		if(value)
		{
			System.out.println("Jack name found");
		}
		else
		{
			System.out.println("Jack name not found");
		}

	}
	
	
	//print 296 from webpage 

}
