package SeleniumBasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\D-PC\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();

		driver.findElement(By.name("proceed")).click(); // click on Go btn

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());

		String text = alert.getText();

		if (text.equals("Please enter a valid user name")) {
			System.out.println("correct alert messg");
		} else {
			System.out.println("in-correct alert messg");
		}

		alert.accept(); // click on OK btn

		// alert.dismiss(); //click on cancel btn
		driver.quit();

	}

}
