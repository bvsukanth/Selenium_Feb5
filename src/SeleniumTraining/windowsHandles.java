package SeleniumTraining;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// synchronization techniques
		driver.manage().window().maximize();// This is for maximizing window
		
		driver.findElement(By.className("blinkingText")).click();
		
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> totalwindows = windows.iterator();
		
		String parentWindowId = totalwindows.next();
		String childWindowId = totalwindows.next();
		
		driver.switchTo().window(childWindowId);
		
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		
		String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		//0th location - Please email us 
		//1st location -  mentor@rahulshettyacademy.com with below template to receive response
		
		driver.switchTo().window(parentWindowId);
		
		driver.findElement(By.id("username")).sendKeys(emailId);

	}

}
