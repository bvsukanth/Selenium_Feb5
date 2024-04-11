package SeleniumTraining;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class limitScope_PageLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// synchronization techniques
		driver.manage().window().maximize();// This is for maximizing window
		
		
		System.out.println("Total Hyperlinks in page : " + driver.findElements(By.tagName("a")).size());
		
		System.out.println("Total Hyperlinks in footer : " + driver.findElement(By.id("gf-BIG")).findElements(By.tagName("a")).size());

		System.out.println("Total Hyperlinks in footer - 1st Column: " + driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul")).findElements(By.tagName("a")).size());
		
		int firstColumnsLinkSize = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul")).findElements(By.tagName("a")).size();
		
		for(int i=1;i<firstColumnsLinkSize; i ++)
		{
			String click = Keys.chord(Keys.CONTROL, Keys.ENTER);
			driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul")).findElements(By.tagName("a")).get(i).sendKeys(click);
		}
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> totalwindows = windows.iterator();
		
		
		while(totalwindows.hasNext())
		{
			driver.switchTo().window(totalwindows.next());
			System.out.println(driver.getTitle());
		}
	}

}
