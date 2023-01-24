package objectPackageUsingPageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderHistoryPF {
	@FindBy(xpath = "//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span")
	public static WebElement orderhistory;
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/a/span")
	public static WebElement homebutton;


}
