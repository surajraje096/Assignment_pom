package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;
import config.XPath;



public class Google_03_playPage extends TestBase{

	public Google_03_playPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath =XPath.TitalPlay)
	public WebElement TitalPlay;

	public boolean verifyTitalPlay() {
		Assert.assertTrue( TitalPlay.isDisplayed());
		return true;
	
	}
	@FindBy(xpath =XPath.Playsearch)
	public WebElement Playsearch;

	public boolean verifyPlaysearch() {
		Assert.assertTrue( Playsearch.isDisplayed());
		return true;
	
	}
	@FindBy(xpath=XPath.Playsingbtn)
	public WebElement Playsingbtn;
	
	public Google_04_PlaystoreVerifyPage clickonSigninButton(){
		Playsingbtn.click();
		return new Google_04_PlaystoreVerifyPage();
	}
}
