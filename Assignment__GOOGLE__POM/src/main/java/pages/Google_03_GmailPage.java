package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;
import config.XPath;



public class Google_03_GmailPage extends TestBase {

	public Google_03_GmailPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath =XPath.CreatGmail)
	public WebElement CreatGmail;

	public boolean verifygmailCreatGmail() {
		Assert.assertTrue(CreatGmail.isDisplayed());
		return true;
	
	}

	@FindBy(xpath =XPath.Gmaillogo)
	public WebElement Gmaillogo;

	public boolean verifyGmailGmaillogo() {
		Assert.assertTrue(Gmaillogo.isDisplayed());
		return true;
		
	}
	@FindBy(xpath=XPath.Gmailsingbtn)
	public WebElement Gmailsingbtn;
	
	public Google_04_GmailVerifyPage clickonSigninButton(){
		Gmailsingbtn.click();
		return new Google_04_GmailVerifyPage();
	}
	@FindBy(xpath="/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]")
	public WebElement signinbuttongmailpage;
	
	public Google_04_GmailVerifyPage clickonsigninbuttonGmailpage() throws InterruptedException{
		Thread.sleep(4000);
		signinbuttongmailpage.click();
		return new Google_04_GmailVerifyPage();
	}

}
