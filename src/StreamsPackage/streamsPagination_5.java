package StreamsPackage;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class streamsPagination_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// synchronization techniques
		driver.manage().window().maximize();// This is for maximizing window
		List<String> price;

		driver.findElement(By.xpath("//tr/th[1]/span[2]")).click();

		do {
			List<WebElement> veggieList = driver.findElements(By.xpath("//tbody/tr/td[1]"));

			price = veggieList.stream().filter(s -> s.getText().contains("Tomato")).map(p -> getVegetablePrice(p))
					.collect(Collectors.toList());
			price.forEach(a -> System.out.println(a));

			if (price.size() < 1) {
				driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
			}
		} while (price.size() < 1);

	}

	public static String getVegetablePrice(WebElement e) {
		String price = e.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}

}
