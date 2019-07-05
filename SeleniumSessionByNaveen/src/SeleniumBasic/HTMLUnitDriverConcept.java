package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitDriverConcept {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\D-PC\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
*/		
		WebDriver driver= new HtmlUnitDriver();
		
		driver.get("https://classic.crmpro.com");	
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Before Login title is=="+driver.getTitle());
		
         driver.findElement(By.name("username")).sendKeys("brajesh2288");
         driver.findElement(By.name("password")).sendKeys("brajesh221229");
         driver.findElement(By.xpath("//input[@type='submit']")).click();
         
         System.out.println("After Login title is===="+driver.getTitle());
         
         driver.close();
         System.out.println("Driver is closed now");



	}

}
