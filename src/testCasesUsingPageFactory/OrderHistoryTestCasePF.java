package testCasesUsingPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import objectPackageUsingPageFactory.LoginObjectsPF;
import objectPackageUsingPageFactory.OrderHistoryPF;

public class OrderHistoryTestCasePF {
	
	@Test
	public void orderhistory() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		Thread.sleep(3000);
		
		PageFactory.initElements(driver, LoginObjectsPF.class);
		LoginObjectsPF.username.sendKeys("dinesh.m@zenitus.com");
		LoginObjectsPF.password.sendKeys("SMdinesh@0808");
		LoginObjectsPF.loginbutton.click();
		
		PageFactory.initElements(driver, OrderHistoryPF.class);
		Thread.sleep(5000);
		OrderHistoryPF.orderhistory.click();
		OrderHistoryPF.homebutton.click();
		
	}

}
