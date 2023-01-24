package objectPackageUsingPageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginObjectsPF {
	@FindBy(how = How.ID, using = "email")
	public static WebElement username;
	@FindBy(id = "passwd")
	public static WebElement password;
	@FindBy(xpath = "//*[@id=\"SubmitLogin\"]/span")
	public static WebElement loginbutton;


}
