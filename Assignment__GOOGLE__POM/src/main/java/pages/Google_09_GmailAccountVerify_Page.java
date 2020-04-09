package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;
import config.XPath;



public class Google_09_GmailAccountVerify_Page extends TestBase {
	public Google_09_GmailAccountVerify_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath =XPath.gmailcompose)
	public WebElement gmailcompose;

	public boolean verifygmailgmailcompose() {
		Assert.assertTrue(gmailcompose.isDisplayed());
		return true;

	}
	@FindBy(xpath =XPath.gmailinbox)
	public WebElement gmailinbox;

	public boolean verifygmailgmailinbox() {
		Assert.assertTrue(gmailinbox.isDisplayed());
		return true;
		
	}
	@FindBy(xpath =XPath.gmailstarred)
	public WebElement gmailstarred;

	public boolean verifygmailgmailstarred() {
		Assert.assertTrue(gmailstarred.isDisplayed());
		return true;
		
	}
	@FindBy(xpath =XPath.gmailsent)
	public WebElement gmailsent;

	public boolean verifygmailgmailsent() {
		Assert.assertTrue(gmailsent.isDisplayed());
		return true;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
