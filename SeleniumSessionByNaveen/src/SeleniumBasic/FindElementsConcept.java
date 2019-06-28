package SeleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\D-PC\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//driver.navigate().to("https://www.ebay.com/");
		driver.get("https://www.spicejet.com");
		
		
	/*	//To Display the link  in webPage
		
		List <WebElement> linklist=driver.findElements(By.tagName("a"));
		int count= linklist.size();
		
		System.out.println("Total No of Links Present"+ count);
		  
		for(int i=1; i<count; i++)
		{
			System.out.println(linklist.get(i).getText());
		}*/
		
		

		//To Display the ul elements in webPage
		
		//List <WebElement> ullist=driver.findElements(By.tagName("ul"));
		List <WebElement> ullist=driver.findElements(By.tagName("li"));
		int count1= ullist.size();
		
		System.out.println("Total No of ul Present"+ count1);
		  
		for(int i=1; i<count1; i++)
		{
			System.out.println(ullist.get(i).getText());
		}
		
		
		driver.close();
		

	}

}
