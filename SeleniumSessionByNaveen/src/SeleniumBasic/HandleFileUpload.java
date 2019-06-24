package SeleniumBasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUpload {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\D-PC\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://html.com/input-type-file/");
		driver.manage().window().maximize();
		/*Alert alert= driver.switchTo().alert();
		alert.accept();*/

		driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("C:\\Users\\D-PC\\Desktop\\Demo.txt");
		System.out.println("File has been UpLloaded Successfully");
		driver.close();

	}

}
