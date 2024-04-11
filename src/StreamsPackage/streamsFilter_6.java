package StreamsPackage;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class streamsFilter_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// synchronization techniques
		driver.manage().window().maximize();// This is for maximizing window
		
		driver.findElement(By.id("search-field")).sendKeys("Cherry");
		List<WebElement> veggieList = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		List<WebElement> veggieListStream = veggieList.stream().filter(a -> a.getText().contains("Cherry")).collect(Collectors.toList());
		
		if(veggieListStream.size()>=1)
		{
			System.out.println("Cherry Found");
			Assert.assertTrue(true);
		}else
		{
			System.out.println("Cherry Not Found");
			Assert.assertTrue(false);
		}

	}

}
