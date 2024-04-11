package SeleniumTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class relativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// synchronization techniques
		driver.manage().window().maximize();// This is for maximizing window
		
		//above, below, totheleft, totheright
		WebElement ele1 = driver.findElement(By.name("name"));
		System.out.println(driver.findElement(with((By.tagName("label"))).above(ele1)).getText());
		
		WebElement ele2 = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(with((By.tagName("input"))).below(ele2)).click();
		
		WebElement ele3 = driver.findElement(By.cssSelector("[for='exampleCheck1']"));
		driver.findElement(with((By.tagName("input"))).toLeftOf(ele3)).click();
		
		WebElement ele4 = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with((By.tagName("label"))).toRightOf(ele4)).getText());

	}

}
