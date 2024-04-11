package SeleniumTraining;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenShotsPartial {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// synchronization techniques
		driver.manage().window().maximize();// This is for maximizing window
		
		WebElement ele = driver.findElement(By.name("name"));
		ele.sendKeys("Hello");
		File screenShotPartial = ele.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShotPartial, new File("D:\\screenshots\\PartialFailureScreenshot.png"));

	}

}
