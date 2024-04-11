package SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		// By Cssselector - id
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("test");

		// By Cssselector - regular expression
		driver.findElement(By.cssSelector("input[type*='password']")).sendKeys("rahulshettyacademy");

		// By ClassName
		driver.findElement(By.className("signInBtn")).click();

		Thread.sleep(2000);

		// By TagName locator
		System.out.println(driver.findElement(By.tagName("p")).getText());
		String loginSuccessMessage = driver.findElement(By.tagName("p")).getText();

		// TestNG Concept
		Assert.assertEquals(loginSuccessMessage, "You are successfully logged in.");

		// Xpath using contains text
		driver.findElement(By.xpath("//button[contains(text(),'Log Out')]")).click();

		// Go to https://demoqa.com/text-box
		// Enter text in Name, Email, Current Address and Permanent Address
		// click submit
		// print values in console 

	}

}
