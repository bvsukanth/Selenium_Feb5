package SeleniumTraining;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandles2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// synchronization techniques
		driver.manage().window().maximize();// This is for maximizing window
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> totalwindows = windows.iterator();
		
		String parentWindowId = totalwindows.next();
		String childWindowId = totalwindows.next();
		
		driver.switchTo().window(childWindowId);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		String text = driver.findElement(By.className("signInBtn")).getText();
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.cssSelector("[name='name']")).sendKeys(text);
		
		

	}

}
