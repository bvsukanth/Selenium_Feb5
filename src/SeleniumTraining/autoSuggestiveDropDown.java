package SeleniumTraining;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestiveDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// synchronization techniques
		
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		
		List<WebElement> dropdownOptions = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		
		for(WebElement element : dropdownOptions)
		{
			if(element.getText().equalsIgnoreCase("India"))
			{
				element.click();
			}
		}

	}

}
