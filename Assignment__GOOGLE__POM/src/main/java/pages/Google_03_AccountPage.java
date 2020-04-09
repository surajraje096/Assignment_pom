package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;
import config.XPath;


public class Google_03_AccountPage extends TestBase {

	public Google_03_AccountPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='sdgBod']")
	public WebElement GoogleAccount;

	public boolean verifyGoogleAccount() {
		
		Assert.assertTrue(GoogleAccount.isDisplayed());
		return true;
		
		
	}
	
	@FindBy(xpath=XPath.Accountsingbtn)
	public WebElement Accountsingbtn;
	
	public Google_04_AccountVerifyPage clickonSigninButton(){
		Accountsingbtn.click();
		return new Google_04_AccountVerifyPage();
	}
	
	
	
	

}
