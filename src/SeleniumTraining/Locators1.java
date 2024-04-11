package SeleniumTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Webdriver is interface - Chromedriver, edgedriver, firefoxdriver classes will implement webdriver
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// synchronization techniques
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//1st Locator - By ID
		WebElement username = driver.findElement(By.id("inputUsername"));
		username.sendKeys("Hello@gmail.com");
		
		//2nd Locator - By Name
		WebElement password = driver.findElement(By.name("inputPassword"));
		password.sendKeys("password");
		
		//3rd Locator - By Class
		WebElement signInBtn = driver.findElement(By.className("signInBtn"));
		signInBtn.click();
		
		//4th Locator - Type 1 - By cssSelector - tag.class
		WebElement errorMessage = driver.findElement(By.cssSelector("p.error"));
		String error = errorMessage.getText();
		System.out.println(error);
		
		//5th locator - Link Text
		WebElement forgotPassword = driver.findElement(By.linkText("Forgot your password?"));
		forgotPassword.click();
		
		//6th Locator - Xpath - Type 1 //tagname[@attribute='value']
		WebElement usernametext = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		usernametext.sendKeys("Hello World");
		
		//By Css Selector - tagname[attribute='value']
		WebElement emailtext = driver.findElement(By.cssSelector("input[placeholder='Email']"));
		emailtext.sendKeys("Hello@Hello.com");
		
		//By xpath - using index
		WebElement mobiletext = driver.findElement(By.xpath("//input[@type='text'][3]"));
		mobiletext.sendKeys("9999999999");
		
	    //By cssselector - using index
		WebElement mobiletextcss = driver.findElement(By.cssSelector("input[type='text']:nth-child(4)"));
		mobiletextcss.clear();
		
		//By xpath - parent child
		WebElement mobiletextxpath = driver.findElement(By.xpath("//form/input[3]"));
		mobiletextxpath.sendKeys("1234567890");
		
		//By CssSelector - .class
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		//By CssSelector - Parent -> child
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());

		
		//By Xpath - filter - parent -> child 
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		
		//By Cssselector - id
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("test");
		
		//By Cssselector - regular expression
		driver.findElement(By.cssSelector("input[type*='password']")).sendKeys("rahulshettyacademy");
		
		//By Id
		driver.findElement(By.id("chkboxOne")).click();
		
		//By Name
		driver.findElement(By.name("chkboxTwo")).click();
		
		//By ClassName
		driver.findElement(By.className("signInBtn")).click();
		
		
		//Go to https://demoqa.com/text-box
		//Enter text in Name, Email, Current Address and Permanent Address 
		
		System.out.println("Hello for Github");
		
		

	}

}
