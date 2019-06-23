package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;

public class LocaterConcept {

	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\D-PC\\Desktop\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru="); // enter
																									// url
		driver.manage().window().maximize();

		// 1. xpath: -- 2
		// absolute xath should not be used. -- html/body/div[1]/div[5]/div[2]/a
		// only relative xpath should be used. -- //*[@id='firstname']
		driver.findElement(By.id("firstname")).sendKeys("Brajesh");
		driver.findElement(By.id("lastname")).sendKeys("Gupta");
		driver.findElement(By.id("address1")).sendKeys("Street No 6,J-110");
		driver.findElement(By.id("address1")).sendKeys("Laxmi Nagar");
		driver.findElement(By.id("city")).sendKeys("New york");
		driver.findElement(By.id("zip")).sendKeys("10018");
		driver.findElement(By.id("dayphone1")).sendKeys("123");
		driver.findElement(By.id("dayphone2")).sendKeys("456");
		driver.findElement(By.id("dayphone3")).sendKeys("7890");
		driver.findElement(By.id("dayphone4")).sendKeys("2288");
		driver.findElement(By.id("email")).sendKeys("brajesh2288@gmail.com");
		driver.findElement(By.id("retype_email")).sendKeys("brajesh2288@gmail.com");
		driver.findElement(By.id("userid")).sendKeys("brajesh2019");
		driver.findElement(By.id("PASSWORD")).sendKeys("brajesh221229");
		driver.findElement(By.id("rpass")).sendKeys("brajesh221229");

		// Handle Dropdown using select class

		Select dropdown = new Select(driver.findElement(By.id("state")));
		dropdown.getFirstSelectedOption();
		// dropdown.selectByIndex(2);
		dropdown.selectByVisibleText("New York");

		java.util.List<WebElement> l = dropdown.getOptions();
		int count = l.size() - 1;
		System.out.println("No of State in Dropdown is " + count);

		// Loop to print one by one in dropdown list
		for (int j = 0; j < l.size(); j++) {
			System.out.println(l.get(j).getText());
		}

		Select dropdown2 = new Select(driver.findElement(By.id("SECRET_QUESTION")));
		dropdown2.selectByIndex(2);

		java.util.List<WebElement> l1 = dropdown2.getOptions();
		int count1 = l1.size();
		System.out.println("No of Secret Question  is " + count1);
		// Loop to print one by one in dropdown list
		for (int j = 0; j < l1.size(); j++) {
			System.out.println(l1.get(j).getText());
		}

		driver.findElement(By.id("SECRET_ANSWER")).sendKeys("Rekha Gupta");//

		Select dropdown3 = new Select(driver.findElement(By.id("birthdate2")));
		dropdown3.selectByVisibleText("September");

		java.util.List<WebElement> l2 = dropdown3.getOptions();
		int count2 = l2.size();
		System.out.println("No of Month  is " + count2);
		// Loop to print one by one in dropdown list
		for (int j = 0; j < l2.size(); j++) {
			System.out.println(l2.get(j).getText());
		}

		Select dropdown4 = new Select(driver.findElement(By.id("birthdate1")));
		dropdown4.selectByVisibleText("22");

		java.util.List<WebElement> l3 = dropdown4.getOptions();
		int count3 = l3.size();
		System.out.println("No of Day  is " + count3);
		// Loop to print one by one in dropdown list
		for (int j = 0; j < l3.size(); j++) {
			System.out.println(l3.get(j).getText());
		}

		// Loop to print one by one in dropdown list
		Select dropdown5 = new Select(driver.findElement(By.id("birthdate3")));
		dropdown5.selectByVisibleText("1988");
        java.util.List<WebElement> l4 = dropdown5.getOptions();
		int count4 = l4.size();
		System.out.println("No of years  is " + count4);
		
		// Loop to print one by one in dropdown list
		for (int j = 0; j < l4.size(); j++) {
			System.out.println(l4.get(j).getText());
		}
		
		//acceptq1
		
		WebElement checkbox =  driver.findElement(By.id("acceptq1"));
		checkbox.click();
		System.out.println(checkbox.isSelected());
		System.out.println(checkbox.isDisplayed());
		System.out.println(checkbox.isSelected());
		System.out.println(checkbox.isEnabled());
		
		
		driver.findElement(By.xpath("//*[@id='continue']/span/span")).click();
		
		
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
