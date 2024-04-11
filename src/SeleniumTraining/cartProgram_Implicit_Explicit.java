package SeleniumTraining;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cartProgram_Implicit_Explicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		// comments -// , /*-----*/
		// synchronization techniques - Implicit Wait, Explicit Wait, Fluent Wait,
		// Thread.sleep()
		// Implicit Wait - it is at driver level- it is for all UI controls
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		// Explicit Wait - It is UI control level
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.manage().window().maximize();// This is for maximizing window

		String[] requiredVegetables = { "Cucumber", "Cauliflower", "Apple", "Mango" };
		
		addVegetables(driver, requiredVegetables);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
		
		//syntax for Explicitwait
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("promoInfo")));
		
		System.out.println(driver.findElement(By.className("promoInfo")).getText());

		

	}

	public static void addVegetables(WebDriver driver, String[] requiredVegetables) {
		
		List<WebElement> productNames = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < productNames.size(); i++) {
			// if(productNames.get(i).getText().contains("Apple"))
			// {
			// driver.findElements(By.xpath("//button[contains(text(),'ADD TO
			// CART')]")).get(i).click();
			// break;
			// }

			List<String> expectedProductNamesList = Arrays.asList(requiredVegetables);
			String[] veggiename = productNames.get(i).getText().split("-");
			String trimmedVeggieName = veggiename[0].trim();

			if (expectedProductNamesList.contains(trimmedVeggieName)) {
				// driver.findElements(By.xpath("//button[contains(text(),'ADD TO
				// CART')]")).get(i).click();
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
			}
		}
	}

}
