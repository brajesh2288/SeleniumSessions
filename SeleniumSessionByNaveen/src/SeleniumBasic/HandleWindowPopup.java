package SeleniumBasic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopup {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\D-PC\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #2")).click();
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Set<String>  Handle= driver.getWindowHandles();
		
		Iterator<String> itr = Handle.iterator();
		String parentwindowid =itr.next();
		System.out.println("Parent window id     "+parentwindowid);
		
		
		String childwindowid =itr.next();
		System.out.println("Child window id     "+childwindowid);
		
		driver.switchTo().window(childwindowid);
		
		 try {
			Thread.sleep(5000);
			System.out.println(driver.getTitle());
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		 
            driver.close();
            driver.switchTo().window(parentwindowid);
            System.out.println(driver.getTitle());
            driver.quit();
            
           

	}

}
