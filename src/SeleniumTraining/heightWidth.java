package SeleniumTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class heightWidth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// synchronization techniques
		driver.manage().window().maximize();// This is for maximizing window
		
		WebElement ele = driver.findElement(By.name("name"));
		System.out.println("Height : " +ele.getRect().getDimension().getHeight());
		System.out.println("Width : " +ele.getRect().getDimension().getWidth());
		
		//Assert.assertEquals(ele.getRect().getDimension().getHeight(), 35);

	}

}

//https://demoqa.com/text-box - Partial screenshot of Full Name
//Use Relative Locators and print text
