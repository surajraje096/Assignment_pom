package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;
import config.XPath;



public class Google_03_PhotosPage extends TestBase {

	public Google_03_PhotosPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath =XPath.TitalPhotos)
	public WebElement TitalPhotos;

	public boolean verifyTitalPhotos() {
		Assert.assertTrue( TitalPhotos.isDisplayed());
		return true;
	
	}
	@FindBy(xpath =XPath.gotoPhotos)
	public WebElement gotoPhotos;

	public boolean verifygotoPhotos() {
		Assert.assertTrue(gotoPhotos.isDisplayed());
		return true;

	}
	@FindBy(xpath=XPath.Photossingbtn)
	public WebElement Photossingbtn;
	
	public Google_04_PhotosVerifyPage clickonSigninButton(){
		Photossingbtn.click();
		return new Google_04_PhotosVerifyPage();
	}
}
