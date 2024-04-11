package SeleniumTraining;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenShots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// synchronization techniques
		driver.manage().window().maximize();// This is for maximizing window
		
		String actualTextFromWebsite = driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']")).getText();
		String expectedText = "One Way Trip";
		
		if(expectedText.equalsIgnoreCase(actualTextFromWebsite))
		{
			System.out.println("Text Matched");
		}
		else
		{
			System.out.println("Text Not Matched");
			File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenShot, new File("D:\\screenshots\\FailureScreenshot.png"));
		}

	}

}
