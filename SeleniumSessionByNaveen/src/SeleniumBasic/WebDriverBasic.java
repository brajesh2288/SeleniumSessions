package SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverBasic {

	public static WebDriver driver;

	public static void main(String[] args)

	{
		/*
		 * System.setProperty("webdriver.edge.driver",
		 * "C:\\Users\\D-PC\\Desktop\\selenium\\msedgedriver.exe"); driver= new
		 * EdgeDriver();
		 */
		//launching internet explorerdriver
		System.setProperty("webdriver.ie.driver", "C:\\Users\\D-PC\\Desktop\\selenium\\MicrosoftWebDriver.exe");
		driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
		String str1 = driver.getTitle();
		driver.close();
		System.out.println("Internet Explorer" + str1);
		
		//launching  Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\D-PC\\Desktop\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String str2 = driver.getTitle();
		driver.close();
		System.out.println("Chrome title" + str2);
		
		//launching FireFox
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		if (str1.equals(str2)) {
			System.out.println("Cross browser tested Successfully");
		} else
			System.out.println("Cross browser tested Failure");
	      System.out.println(driver.getCurrentUrl());
	      System.out.println(driver.getPageSource());//t display the webpage source 
	      System.out.println(driver.getCurrentUrl());
		System.out.println("We are closing the Driver now");
		driver.quit();
	}

}
