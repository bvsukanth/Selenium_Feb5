package SeleniumTraining;

import java.io.File;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class chromeOptionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		//FirefoxOptions foptions = new FirefoxOptions();
		//EdgeOptions eoptions = new EdgeOptions();
		
		//SSL certificate expired and we are skipping 
		options.setAcceptInsecureCerts(true);
		
		//It will open browser with extensions 
		options.addExtensions(new File("D:/extensions/tool.crx"));
		
		//Add Proxy capability to WebDriver
		Proxy proxy = new Proxy();
		//below proxyname and port will be given by company
		proxy.setHttpProxy("myhttpproxy:3333");
		options.setCapability("proxy", proxy);
		
		//disable popups 
		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		
		//download file into particular location
		HashMap<String, Object> preferences = new HashMap<String, Object>();
		preferences.put("download.default_directory", "D:\\Selenium\\Downloads");
		options.setExperimentalOption("prefs", preferences);
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// synchronization techniques
		driver.manage().window().maximize();// This is for maximizing window
		
		
		//delete cookies - these are the ways to delete cookies
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("");
		driver.manage().deleteCookie(null);

	}

}
