package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import config.XPath;



public class Google_04_GmailVerifyPage extends TestBase {
	public Google_04_GmailVerifyPage(){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath=XPath.Gmailid)
	public WebElement Gmailid;
	
	public void enterId(String id){
		Gmailid.sendKeys(id);
		Gmailid.sendKeys(Keys.ENTER);
	}
	
	@FindBy(xpath=XPath.Gmailpassword)
	public WebElement Gmailpassword;
	
	public void enterPassword(String password){
		Gmailpassword.sendKeys(password);
		Gmailpassword.sendKeys(Keys.ENTER);
		
	}
	public Google_10Page enterPasswordfor10page(String password){
		Gmailpassword.sendKeys(password);
		Gmailpassword.sendKeys(Keys.ENTER);
		return new Google_10Page();
	}
	public Google_11_GmailStarPage enterPasswordfor11page(String password){
		Gmailpassword.sendKeys(password);
		Gmailpassword.sendKeys(Keys.ENTER);
		return new Google_11_GmailStarPage();
	}
	public Google_12_ReadEmailPage enterPasswordfor12_1page(String password){
		Gmailpassword.sendKeys(password);
		Gmailpassword.sendKeys(Keys.ENTER);
		return new Google_12_ReadEmailPage();
	}	
	public Google_13_GmailComposeVerifyPage enterPasswordfor13page(String password){
		Gmailpassword.sendKeys(password);
		Gmailpassword.sendKeys(Keys.ENTER);
		return new Google_13_GmailComposeVerifyPage();
	}	

	public Google_14_GmailsendmailPage enterPasswordfor14page(String password){
		Gmailpassword.sendKeys(password);
		Gmailpassword.sendKeys(Keys.ENTER);
		return new Google_14_GmailsendmailPage();
	}	
	public Google_15_GmailSearchPage enterPasswordfor15searchpage(String password){
		Gmailpassword.sendKeys(password);
		Gmailpassword.sendKeys(Keys.ENTER);
		return new Google_15_GmailSearchPage();
	}
	public Google_16_MailwithAttachmentPage enterPasswordfor16attachmentpage(String password){
		Gmailpassword.sendKeys(password);
		Gmailpassword.sendKeys(Keys.ENTER);
		return new Google_16_MailwithAttachmentPage();
	}
	public Google_09_GmailAccountVerifyPage enterPasswordfor9page(String password){
		Gmailpassword.sendKeys(password);
		Gmailpassword.sendKeys(Keys.ENTER);
		return new Google_09_GmailAccountVerifyPage();
	}
	public Google_18_VerifyLabelPage enterPasswordfor18page(String password){
		Gmailpassword.sendKeys(password);
		Gmailpassword.sendKeys(Keys.ENTER);
		return new Google_18_VerifyLabelPage();
	}
	public Google_19_VerifyGmailMovePage enterPasswordfor19page(String password){
		Gmailpassword.sendKeys(password);
		Gmailpassword.sendKeys(Keys.ENTER);
		return new Google_19_VerifyGmailMovePage();
	}
	public Google_09_GmailAccountVerify_Page enterPasswordfor20page(String password){
		Gmailpassword.sendKeys(password);
		Gmailpassword.sendKeys(Keys.ENTER);
		return new Google_09_GmailAccountVerify_Page();
	}
	
}

