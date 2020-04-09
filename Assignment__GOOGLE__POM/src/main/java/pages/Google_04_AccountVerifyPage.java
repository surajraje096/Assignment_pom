package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import config.XPath;



public class Google_04_AccountVerifyPage extends TestBase {
	public Google_04_AccountVerifyPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = XPath.Accountid)
	public WebElement Accountid;

	@FindBy(xpath = XPath.Accountpassword)
	public WebElement Accountpassword;

	public void enterId(String id) {
		Accountid.sendKeys(id);
		Accountid.sendKeys(Keys.ENTER);
	}

	public void enterPassword(String password) {
		Accountpassword.sendKeys(password);
		Accountpassword.sendKeys(Keys.ENTER);

	}

}
