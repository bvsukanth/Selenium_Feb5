package SeleniumTraining;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;

import javax.print.attribute.HashAttributeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fileUpload_AUTOIT {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", System.getProperty("user.dir"));
		//prefs.put("download.default_directory", "D:\\Downloads\\AutoIT");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.pdf2go.com/pdf-to-word");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Choose File')]")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Hanvith\\Documents\\AutoITScript\\fileupload.exe");
		driver.findElement(By.xpath("(//strong[@class='text-uppercase convert_to'])[1]")).click();
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("download-btn")));
		Thread.sleep(5000);
		driver.findElement(By.className("download-btn")).click();
		Thread.sleep(5000);

	}

}
