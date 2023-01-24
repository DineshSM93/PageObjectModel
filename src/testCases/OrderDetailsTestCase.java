package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectPackage.LoginObjects;
import objectPackage.OrderHistoryObjects;

public class OrderDetailsTestCase {
	
	@Test
	public void orderDetails() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		Thread.sleep(3000);
		
		LoginObjects.userName(driver).sendKeys("dinesh.m@zenitus.com");
		LoginObjects.password(driver).sendKeys("SMdinesh@0808");
		LoginObjects.loginButton(driver).click();
		Thread.sleep(3000);
		
		OrderHistoryObjects.orderhistory(driver).click();
		Thread.sleep(3000);
		OrderHistoryObjects.homeButton(driver).click();
	}

}
