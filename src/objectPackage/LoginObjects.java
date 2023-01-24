package objectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginObjects {
	public static WebElement userName(WebDriver driver) {
		return driver.findElement(By.id("email"));
	}
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.id("passwd"));
	}
	public static  WebElement loginButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));		
	}

}
