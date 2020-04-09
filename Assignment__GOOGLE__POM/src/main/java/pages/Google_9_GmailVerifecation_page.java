package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import config.XPath;



public class Google_9_GmailVerifecation_page extends TestBase {
	public Google_9_GmailVerifecation_page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "")
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
