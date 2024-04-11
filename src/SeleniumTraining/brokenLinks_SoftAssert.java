package SeleniumTraining;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class brokenLinks_SoftAssert {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// synchronization techniques
		driver.manage().window().maximize();// This is for maximizing window
		
		//this is a class
		SoftAssert a = new SoftAssert();

		List<WebElement> urls = driver.findElements(By.tagName("a"));

		for (WebElement e : urls) {
			String url = e.getAttribute("href");
			System.out.println(url);

			// 200 - Success
			// 300 and above - redirection
			// 400 and above - failure

			if (!url.isBlank()) {
				HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
				conn.setRequestMethod("HEAD");
				conn.connect();
				//if (conn.getResponseCode() > 400) {
				//	System.out.println("URL :" + url);
				//	Assert.assertTrue(false);
				//}
				
				a.assertTrue(conn.getResponseCode()<404, "Broken Link : " + url );
			}
		}
		
		a.assertAll();

	}

}
