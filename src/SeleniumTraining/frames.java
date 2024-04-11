package SeleniumTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// synchronization techniques
		driver.manage().window().maximize();// This is for maximizing window
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		WebElement windowframe = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(windowframe);
		//driver.switchTo().frame(0);
		
		Actions action = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		action.dragAndDrop(source, target).build().perform();
		
		driver.switchTo().defaultContent();

	}

}
