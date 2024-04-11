package StreamsPackage;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class streamsSort_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// synchronization techniques
		driver.manage().window().maximize();// This is for maximizing window
		
		driver.findElement(By.xpath("//tr/th[1]/span[2]")).click();
		List<WebElement> veggieList = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		List<String> veggieListfromUI = veggieList.stream().map(s -> s.getText()).collect(Collectors.toList());
		List<String> veggieListfromUISorted = veggieListfromUI.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(veggieListfromUI.equals(veggieListfromUISorted));

	}

}
