package SeleniumTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class updatedDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// synchronization techniques
		
		driver.findElement(By.id("divpaxinfo")).click();
		int i=0;
		while(i<3)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			driver.findElement(By.id("hrefIncChd")).click();
			i++;
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();

	}

}
