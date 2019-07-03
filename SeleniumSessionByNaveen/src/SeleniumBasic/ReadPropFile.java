package SeleniumBasic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropFile {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();

		FileInputStream ip = new FileInputStream(
				"C://Users//D-PC//git//SeleniumSessions//SeleniumSessionByNaveen//src//SeleniumBasic//config.properties");
		prop.load(ip);

		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("place"));
		String urlname = prop.getProperty("url");
		String browser = prop.getProperty("browsername");
		System.out.println(urlname);
		System.out.println(browser);

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\D-PC\\Desktop\\selenium\\chromedriver.exe");
			driver = new ChromeDriver(); // launch chrome
		} else if (browser.equals("ie")) {

			System.setProperty("webdriver.ie.driver", "C:\\Users\\D-PC\\Desktop\\selenium\\MicrosoftWebDriver.exe");
			driver = new InternetExplorerDriver();

		} else if (browser.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver", "C:\\Users\\D-PC\\Desktop\\selenium\\geckodriver.exe");
			driver = new FirefoxDriver();

		}

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println("Before Login-----------" + driver.getTitle());

		driver.findElement(By.xpath(prop.getProperty("username-xpath"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath(prop.getProperty("password-xpath"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("signin-xpath"))).click();

		System.out.println("After login-------------" + driver.getTitle());
		driver.close();

	}

}
