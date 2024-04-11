package TestDemoPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestDemoClassfile {
	
	public void packageMethod()
	{
		System.out.println("Hello from package Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();// opening browsing 
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");// go to google.com
		String pagetitle = driver.getTitle();// get page title 
		
		System.out.println(pagetitle);// print page title 
		
		driver.get("https://www.amazon.com");// go to google.com
		String pagetitle1 = driver.getTitle();// get page title 
		
		System.out.println(pagetitle1);// print page title 

	}

}
